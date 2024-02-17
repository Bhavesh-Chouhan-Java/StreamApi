package com.jalaramcwa;

public class CloneUser {
    private int id;
    private String name;

    public CloneUser(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public CloneUser() {
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
