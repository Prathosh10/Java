package com.JAVA_DSA;

import java.util.Scanner;

public class methods_calling {
    public static void main(String[]args){
        System.out.println("Sum of digits");

        Scanner in=new Scanner(System.in);
        int value=in.nextInt();
        int answer=SumOfDigit(value);
        System.out.println("The sum given digit is "+ answer);
    }

    static int SumOfDigit(int val){
        int temp=val;
        int sum=0;
        int i;
        while (temp>0){
            i=temp%10;
            sum=sum+i;
            temp=temp/10;
        }
        return sum;
    }
}
