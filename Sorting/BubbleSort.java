package com.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1}; // test case : 2,5,1,3,4,-7,-9,-1,8,4,7,9,78,90,87
        System.out.println("Before sort"+ Arrays.toString(arr)+" ");
        Sort(arr);
        System.out.println("After sort"+ Arrays.toString(arr)+" ");
    }
    static int[] Sort(int arr[]){

        for (int j=1;j<arr.length;j++){
            for (int i=0;i< arr.length-j;i++){
                int temp;
                if (arr[i]>arr[i+1]){
                    temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
        return arr;
    }
}
