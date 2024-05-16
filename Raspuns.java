package com.example.autoexpert;



public class Raspuns {
    private String text;
    private boolean corect;

    public Raspuns(String text, boolean corect) {
        this.text = text;
        this.corect = corect;

    }


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isCorect() {
        return corect;
    }

    public void setCorect(boolean corect) {
        this.corect = corect;
    }


}
