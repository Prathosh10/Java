package com.BInary_Search;

public class floor_of_a_number {
    public static void main(String[] args) {
        int arr[]=new int[]{2,3,5,9,14,16,18};
        int target=1;

        int ans=floorNumber(arr,target);
        System.out.println(ans);
    }
    static int floorNumber(int arr[],int target){
        if (target<arr[0]){
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
        return arr[end];
          /* (this conditions also give correct answer instaed of using arr[start])
            if (arr[mid]<=target)
                return arr[mid-1];
            else
                return arr[mid];
          */
    }
}
