package com.mphasis.cui.components;

public class TextEditor {
    private SpellChecker spellChecker;
    public TextEditor(){
        System.out.println("Default Constructor");
    }
    public TextEditor(SpellChecker spellChecker) {
        System.out.println("Inside TextEditor Constructor");
        this.spellChecker = spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
