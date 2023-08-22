package com.JAVA_DSA;

import java.util.Scanner;

public class testTwo {
    static boolean test2(int a){
        int count=0;
        int temp=a;
        while(0<temp){
            temp=temp/10;
            count++;
        }
        if (count==2){
            return true;
        }
        return false;
    }
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        System.out.println(test2(a));
    }
}
