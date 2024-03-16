package com.jalaramcwa.java.example;

public final class BuilderClass {

    private final int id;
    private final String name;
    private final String address;

    private BuilderClass(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.address = builder.address;
    }

    private BuilderClass(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public static class Builder{

        private final int id;
        private final String name;
        private final String address;

        public Builder(int id, String name, String address) {
            this.id = id;
            this.name = name;
            this.address = address;
        }

        public BuilderClass build(){
            return new BuilderClass(this);
        }

        public BuilderClass create(){
            return new BuilderClass(id,name,address);
        }
    }

}
