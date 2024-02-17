package com.jalaramcwa;

public class VolkswagenProgram {
    public static void main(String[] args) {
        int a = 100400;
        Integer b = a;
        Integer c = 100400;
        //int d = a;
        System.out.println(a == c);
        System.out.println(b == c);

        String str = "bhav";
        String str1 = new String("bhav");
        String str2 = str1;

        System.out.println(str == str2);
        System.out.println(str == str1);
        System.out.println(str1 == str2);
        System.out.println(str.equals(str2));

        char ch = 'z';
        int f = ch;
        //System.out.println(ch);
        //System.out.println(f);

    }
}
