package com.Sorting;

import java.util.Arrays;

public class selection_sort {
    //Selection sort
    public static void main(String[] args) {
        int nums[]=new int[]{4,5,6,12,3,-1,1};
        System.out.println(Arrays.toString(nums));   // before sort
        SelectSort(nums);
        System.out.println(Arrays.toString(nums));  // after sort
        // another method
        SelectSort1(nums);
    }
    static void SelectSort(int nums[]){
        int temp;
        int n=nums.length;
        for (int x=1;x<=n-1;x++){
            int max_pos=0;
            for (int y=0;y<=n-x;y++){
                if(nums[max_pos]<nums[y]){
                    max_pos=y;
                }
            }
            for (int z=0;z<1;z++){
                temp=nums[max_pos];
                nums[max_pos]=nums[n-x];
                nums[n-x]=temp;
            }
        }
    }

    static void SelectSort1(int nums[]){

    }
}
