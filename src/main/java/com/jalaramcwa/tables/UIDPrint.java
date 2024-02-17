package com.jalaramcwa.tables;


import java.util.UUID;

public class UIDPrint {
    public static void main(String[] args) {
        UUID uuid = UUID.randomUUID();
        String uniqueId = uuid.toString();//.replaceAll("-", "");
        System.out.println("Unique ID: " + uniqueId);
    }
}
