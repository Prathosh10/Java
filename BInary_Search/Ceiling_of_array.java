package com.BInary_Search;

public class Ceiling_of_array {
    public static void main(String[] args) {
        int arr[]=new int[]{2,3,5,9,14,16,18};
        int target=19;

        int ans=CeilingArray(arr,target);
        System.out.println(ans);
    }
    static int CeilingArray(int arr[],int target){
        if (target>arr[arr.length-1]){
            return -1;
        }

        int start=0;
        int end=arr.length-1;
        int mid=0;
        while(start<=end){
            mid=start+(end-start)/2;

            if (arr[mid]<target){
                start=mid+1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else {
                return target;
            }
        }
        return arr[start];

          /* (this conditions also give correct answer instaed of using arr[start])
            if (arr[mid]<=target)
                return arr[mid+1];
            else
                return arr[mid];
          */

    }
}
