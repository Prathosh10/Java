package com.JAVA_DSA;

import java.util.Scanner;

public class greeting {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        String a=in.nextLine();
        welcome(a); // function call

        int b=sum(1,1); //function call
        System.out.println(b);

    }
    static int sum(int a,int b){ // returning value
        int c=a+b;
        return c;
    }
    static void welcome(String s){
        System.out.println("Welcome "+s);
    }
}
