package com.Recursion.Arrays;

public class LinearSearch {
    public static void main(String[]args){
        int arr[]=new int[]{2,4,46,54,32,13};
        int target=540;
        int ans=LS(arr,target,0);
        System.out.println(ans);
        boolean ans1=check2(arr,target,0);
        System.out.println(ans1);


        int ans3=checkLastIndex(arr,target,arr.length-1);
        System.out.println(ans3);
    }
    static int LS(int arr[],int target,int index){
        if (arr[index]==target)
            return index;
        if (index<arr.length-1)
            return LS(arr,target,index+1);
        return -1;
    }

    static boolean check(int arr[],int target,int index){
        if (arr[index]==target)
            return true;
        if (index<arr.length-1)
            return check(arr,target,index+1);
        return false;
    }
    static boolean check1(int arr[],int target,int index){
        if (index<=arr.length-1)
            return (arr[index]==target) || check1(arr,target,index+1);
        return false;
    }

    static boolean check2(int arr[],int target,int index){
        if (index== arr.length)
            return false;
        if (arr[index]==target)
            return true;
        return check2(arr,target,index+1);
    }
    static int checkLastIndex(int arr[],int target,int index){
        if (index == -1)
            return -1;
        if (arr[index]==target)
            return index;
        return checkLastIndex(arr,target,index-1);
    }
}
