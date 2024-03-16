package com.jalaramcwa.java.example;

import java.util.Collections;
import java.util.List;

public final class ImmutableClass {

    private final int id;
    private final String name;
    private final String address;

    private final List<String> arrayList;

    private ImmutableClass(int id, String name, String address, List<String> arrayList) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.arrayList = Collections.unmodifiableList(arrayList);
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

}
