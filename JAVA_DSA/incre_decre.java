package com.JAVA_DSA;

public class incre_decre {
    public static void main(String[]args){
        int a=1;
        System.out.println("post incre "+a++);
        System.out.println(a);

        System.out.println("pre incre "+ ++a);

        int b=3;
        System.out.println("post decre "+ b--);
        System.out.println(b);

        System.out.println("pre decre "+ --b);
    }
}
