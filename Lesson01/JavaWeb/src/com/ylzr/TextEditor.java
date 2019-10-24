package com.ylzr;

public class TextEditor {
    private SpellChecker spellChecker;

    /*基于设值函数的依赖注入*/
    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void setSpellChecker(SpellChecker spellChecker) {
        System.out.println("Inside setSpellChecker");
        this.spellChecker = spellChecker;
    }

    /*基于构造函数的依赖注入*/
    /*public TextEditor(SpellChecker spellChecker) {
        System.out.println("Inside TextEditor constructor.");
        this.spellChecker = spellChecker;
    }*/

    public void spellCheck(){
        spellChecker.checkSpelling();
    }
}
