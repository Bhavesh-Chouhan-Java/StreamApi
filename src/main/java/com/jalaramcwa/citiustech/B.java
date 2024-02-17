package com.jalaramcwa.citiustech;

import java.io.IOException;

public class B extends A{
    void m1() throws IOException //when we use Exception it will give compile time error so we need to specify IOException
    {
        System.out.println("In m1 B");
    }
}
