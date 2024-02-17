package com.jalaramcwa;

public class ReveresOrderProgram {

    static String revere = "";
    public static void main(String[] args) {
        recurse();
    }

    private static void recurse(){
        String str = "Bhavesh";

        for(int i = str.length()-1 ; i >= 0 ; i--){
            if(recurse(str.charAt(i),str)){
                break;
            }
            System.out.println(revere);
        }
        System.out.println(revere);


    }

    private static boolean recurse(char c,String str){
        revere += c;
        return revere.length() == str.length();
    }
}
