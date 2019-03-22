package com.jsdroid.editor.parser;

import com.jsdroid.editor.widget.CodeEditText;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CodePointBuffer;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Token;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class AbstractParser implements Runnable, Parser {
    protected static ExecutorService singleThreadPool = Executors.newSingleThreadExecutor();
    protected boolean running;
    //start:改变的位置
    protected int start;
    //before:删除的数量
    protected int before;
    //count:添加的数量
    protected int count;
    protected boolean reparse;
    protected CodeEditText codeEditText;
    private List<String> names;

    public AbstractParser() {
        names = new ArrayList<>();
    }

    public CodeEditText getCodeEditText() {
        return codeEditText;
    }

    public void setEditText(CodeEditText codeEditText) {
        this.codeEditText = codeEditText;
    }

    public final void reparse() {
        reparse = true;
        singleThreadPool.execute(this);
    }

    @Override
    public final void parse(int start, int before, int count) {
        this.start = start;
        this.before = before;
        this.count = count;
        preParser(codeEditText.getCodeColors());
        if (running) {
            reparse();
            return;
        }
        running = true;
        singleThreadPool.execute(this);
    }

    @Override
    public final void run() {
        int[] codeColors = codeEditText.getCodeColors();
        onParse(codeEditText.getText().toString(), codeColors);
        if (reparse) {
            reparse = false;
            return;
        } else {
            running = false;
        }
        postInvalidate();
    }

    /**
     * 预解析
     */
    private void preParser(int codeColors[]) {
        //如果代码长度太大，为了避免卡死，不给予预先高亮
        if (codeColors.length > 10_0000) {
            return;
        }
        if (count > before) {
            //添加
            //右移动[1,2,3,0,0] >> [0,0,1,2,3]
            int off = count - before;
            for (int i = codeColors.length - 1; i > start + off && i > 1; i--) {
                codeColors[i] = codeColors[i - off];
            }
        } else {
            //删除
            //左移动 [0,0,1,2,3] >> [1,2,3,0,0]
            int off = before - count;
            for (int i = start; i + off < codeColors.length; i++) {
                codeColors[i] = codeColors[i + off];
            }
        }
        postInvalidate();
    }

    protected final void postInvalidate() {
        codeEditText.postInvalidate();
    }

    /**
     * 是否继续解析
     *
     * @return
     */
    protected final boolean continueParse() {
        return running && reparse == false;
    }

    protected void onParse(String text, int codeColors[]) {
//
        int select = codeEditText.getSelectionStart();
//        for (int i = 0; i < codeColors.length; i++) {
//            codeColors[i] = Colors.comment;
//        }
        try {
            int lastend = 0;
            Lexer lexer = getLexer(text);
            List<? extends Token> tokens = lexer.getAllTokens();
            List<String> names = new ArrayList<>();
            for (Token token : tokens) {
                int start = token.getStartIndex();
                for (int i = lastend; i < start; i++) {
                    codeColors[i] = Colors.comment;
                }
                int end = token.getStopIndex();
                lastend = end+1;
                int color = getTokenColor(token);
                for (int i = start; i < end + 1 && i < codeColors.length; i++) {
                    codeColors[i] = color;
                }
                //添加提示
                if (select < start - 1 || select > end + 1) {
                    String name = getName(token);
                    if (name != null && !names.contains(name)) {
                        names.add(name);
                    }
                }
            }
            this.names = names;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected abstract Lexer getLexer(String text);

    protected abstract int getTokenColor(Token token);

    protected abstract String getName(Token token);

    public boolean in(int type, int min, int max) {
        return (type >= min && type <= max);
    }

    @Override
    public List<String> getNames() {
        return names;
    }

    @Override
    public String format() {
        return null;
    }

    public CharStream createCharStream(String text) {
        byte[] bytes = text.getBytes();
        CodePointCharStream codePointCharStream = CodePointCharStream.fromBuffer(CodePointBuffer.withBytes(ByteBuffer.wrap(bytes)));
        return codePointCharStream;
    }
}
