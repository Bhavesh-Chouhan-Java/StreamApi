package com.jalaramcwa.java.example;

public class SycExample {
    static String string;
    static int i;
    public static void main(String[] args) {

        getCharacter();
    }


    private static void getCharacter(){
        String s = "srbDKi";
        char[] ch = new char[s.length()];
        int q = 0;
        for(int a  = 0 ; a < s.length() ; a++){
            int p = (int) s.charAt(a);

            if(a == s.length() - 1){
                q = (int) s.charAt(s.length() - 1);
                System.out.println(q);
            }else{
                q = (int) s.charAt(a+1);
                if(p < q){
                    q = p;
                    System.out.println(q);
                    //System.out.println(s.charAt(a));
                }
            }
            //System.out.println(s.charAt(a)+"  "+p);
        }


    }
}
