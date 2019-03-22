package com.jsdroid.editor.parser;

public class Tip {
    public String inputText;
    public String replaceText;
    public String showText;

    public Tip(String inputText, String replaceText, String showText) {
        this.inputText = inputText;
        this.replaceText = replaceText;
        this.showText = showText;
    }

    public Tip() {
    }

    @Override
    public String toString() {
        return showText;
    }
}
