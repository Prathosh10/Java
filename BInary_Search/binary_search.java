package com.BInary_Search;

public class binary_search {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,11,22,33,66};
        int target= 33;
        int ans=search(arr,target);
        System.out.println(ans);
    }
    static int search(int arr[],int target){
        int start=0;
        int end=arr.length-1;

        while (start<=end){
            int mid=start+(end-start)/2;
           if (arr[mid]<target){
               start=mid+1;
           }
           else if(target<arr[mid]){
               end=mid-1;
           }
           else{
               return mid;
           }
        }
        return -1;
    }
    /*static int search(int arr[],int target,int start,int end){
        if (start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if (target==arr[mid]){
            return mid;
        }
        if(target<=arr[mid]){
            return search(arr,target,start,mid-1);
        }
        else{
            return search(arr,target,mid+1,end);
        }
    }
     */
}
