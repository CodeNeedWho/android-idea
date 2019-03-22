package com.jsdroid.editor.parser;

import com.jsdroid.antlr4.html.HTMLLexer;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.List;

public class HtmlParser extends AbstractParser {
    static Tip[] templates = new Tip[0];

    static {
        String tags[] = new String[]{
                "a",
                "abbr",
                "acronym",
                "address",
                "applet",
                "area",
                "article",
                "aside",
                "audio",
                "b",
                "base",
                "basefont",
                "bdi",
                "bdo",
                "big",
                "blockquote",
                "body",
                "br",
                "button",
                "canvas",
                "caption",
                "center",
                "cite",
                "code",
                "col",
                "colgroup",
                "command",
                "datalist",
                "dd",
                "del",
                "details",
                "dfn",
                "dialog",
                "dir",
                "div",
                "dl",
                "dt",
                "em",
                "embed",
                "fieldset",
                "figcaption",
                "figure",
                "font",
                "footer",
                "form",
                "frame",
                "frameset",
                "h1",
                "h2",
                "h3",
                "h4",
                "h5",
                "h6",
                "head",
                "header",
                "hr",
                "html",
                "i",
                "iframe",
                "img",
                "input",
                "ins",
                "kbd",
                "keygen",
                "label",
                "legend",
                "li",
                "link",
                "main",
                "map",
                "mark",
                "menu",
                "menuitem",
                "meta",
                "meter",
                "nav",
                "noframes",
                "noscript",
                "object",
                "ol",
                "optgroup",
                "option",
                "output",
                "p",
                "param",
                "pre",
                "progress",
                "q",
                "rp",
                "rt",
                "ruby",
                "s",
                "samp",
                "script",
                "section",
                "select",
                "small",
                "source",
                "span",
                "strike",
                "strong",
                "style",
                "sub",
                "summary",
                "sup",
                "table",
                "tbody",
                "td",
                "textarea",
                "tfoot",
                "th",
                "thead",
                "time",
                "title",
                "tr",
                "track",
                "tt",
                "u",
                "ul",
                "var",
                "video",
                "wbr"
        };
        List<Tip> templates = new ArrayList<>();
        for (String tag : tags) {
            templates.add(createTag(tag));
        }
        HtmlParser.templates = templates.toArray(HtmlParser.templates);
    }

    static Tip createTag(String tag) {
        String content = "<div></div>".replace("div", tag);
        return new Tip(tag, content, content);
    }

    @Override
    protected Lexer getLexer(String text) {
        return new HTMLLexer(createCharStream(text));
    }

    @Override
    protected int getTokenColor(Token token) {
        switch (token.getType()) {
            case HTMLLexer.ATTRIBUTE:
                return Colors.white;
            case HTMLLexer.SCRIPT:
            case HTMLLexer.SCRIPT_OPEN:
            case HTMLLexer.SCRIPT_BODY:
                return Colors.string;
            case HTMLLexer.ATTVALUE_VALUE:
                return Colors.string;
            case HTMLLexer.TAG:
            case HTMLLexer.TAG_CLOSE:
            case HTMLLexer.TAG_EQUALS:
            case HTMLLexer.TAG_NAME:
            case HTMLLexer.TAG_OPEN:
            case HTMLLexer.TAG_SLASH:
            case HTMLLexer.TAG_SLASH_CLOSE:
                return Colors.keyword;

        }
        return Colors.white;
    }

    @Override
    protected String getName(Token token) {
        switch (token.getType()) {
            case HTMLLexer.HTML_TEXT:
                return token.getText();
        }
        return null;
    }

    @Override
    public String[] getKeyWords() {
        return new String[0];
    }

    @Override
    public Tip[] getTemplates() {
        return templates;
    }
}
