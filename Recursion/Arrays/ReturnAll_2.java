package com.Recursion.Arrays;

import java.util.ArrayList;
public class ReturnAll_2 {
    public static void main(String[]args){
        int arr[]=new int[]{1,2,3,3,4,3,5};
        int target=3;
        ArrayList<Integer> ans=AllElement(arr,target,0); // ans storing list,make function call

        System.out.println(ans);
    }

    static ArrayList<Integer> AllElement(int arr[],int target,int index){
        ArrayList<Integer> list=new ArrayList<>();

        if (arr.length==index) {
            return list;
        }
        if (target==arr[index]){
            list.add(index);  // this will contain answer for that function call only
        }
        //to create temp list
        ArrayList<Integer> temp=AllElement(arr,target,index+1);
        list.addAll(temp);
        return list;
    }
}
