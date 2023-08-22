package com.Recursion.Arrays;

import java.util.ArrayList;

public class ReturnAllIndex {
    public static void main(String[] args) {
        int arr[]={12,3,4,5,12,12};
        int target=3;
        AllIndex(arr,target,0);

        printReas(res);
    }
    static ArrayList<Integer> res=new ArrayList<>();
    static void AllIndex(int[] arr, int target, int index){
        if (index == arr.length){
            return;
        }
        if (arr[index]== target){
            res.add(index);
        }
        AllIndex(arr,target,index+1);
    }
    static void printReas(ArrayList res){
        System.out.println(res);
    }
}
