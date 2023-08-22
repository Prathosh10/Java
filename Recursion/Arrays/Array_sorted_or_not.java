package com.Recursion.Arrays;

public class Array_sorted_or_not {
    public static void main(String[]args){
        int arr[]={1,2,3,4,10};
        boolean ans=SortCheck(arr,0);
        System.out.println(ans);

    }
    static Boolean SortCheck(int arr[],int index){
        if (index==arr.length-1)
            return true;

        return arr[index]<arr[index+1] && SortCheck(arr,index+1);
    }
}
