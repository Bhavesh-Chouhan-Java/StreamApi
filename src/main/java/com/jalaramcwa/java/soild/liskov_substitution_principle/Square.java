package com.jalaramcwa.java.soild.liskov_substitution_principle;

public class Square extends Shape{
    public void setWidth(int width) {
        this.width = width;
        this.height = width;
    }

    public void setHeight(int height) {
        this.height = height;
        this.width = height;
    }
}
