package com.JAVA_DSA;

public class sumOfDigits {
    public static void main(String[]args){
        int val1= sumDigit(1234);
        int val2= sumDigit(5678);

        System.out.println(val1);
        System.out.println(val2);
    }

    private static int sumDigit(int i) {
        int a=i;
        int sum=0;
        int j;
        while (0<a){
            j=a%10;
            sum=sum+j;
            a=a/10;
        }
        return sum;
    }
}

