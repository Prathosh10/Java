package com.Recursion.Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ReturnAll_1 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,1,1};
        int tar=1;
        ArrayList<Integer> res=new ArrayList<>(); //result store in this place

        retAllindex(arr,tar,0,res); // function call
        System.out.println(res);
    }
    static ArrayList retAllindex(int arr[],int tar,int index,ArrayList<Integer> res){
        if (index == arr.length){
            return res;
        }
        if (arr[index]==tar){
            res.add(index);
        }
        return retAllindex(arr,tar,index+1,res);
    }
}
