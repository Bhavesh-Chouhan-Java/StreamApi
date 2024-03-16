package com.jalaramcwa.java.example;

public class SingletonExample {
    private static SingletonExample singletonExample;
    private String className;

    private SingletonExample(){}

    public static void setSingletonExample(SingletonExample singletonExample) {
        SingletonExample.singletonExample = singletonExample;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public static SingletonExample getInstance(){
        if (singletonExample == null) {
            synchronized (SingletonExample.class) {
                singletonExample = new SingletonExample();
            }
        }
        return singletonExample;
    }
}
