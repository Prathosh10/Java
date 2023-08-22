package com.BInary_Search;

public class RotatedBinarySearch {
    public static void main(String[]args){
        int arr[]={5,6,7,8,9,1,2,3,4};
        int target=9;
        int ans=search(arr,target,0,arr.length-1);
        System.out.println(ans);
    }
    static int search(int arr[],int target,int start,int end){
        /*
        if (start>end){
            return -1;
        }
        int mid=start+(end-start)/2;

        if(arr[mid]==target){
            return mid;
        }
        if (arr[mid]>arr[start]){
            if(arr[mid]>= target && arr[start]<= target){
                return Search(arr,target,start,mid-1);
            }
            else{
                return Search(arr,target,mid+1,end);
            }
        }

        if(arr[mid]<=target && target <= arr[end]){
            return Search(arr,target,mid+1,end);
        }
        return Search(arr,target,start,mid-1);

        */

        if (start>end){
            return -1;
        }
        int mid=start+(end-start)/2;

        if (target==arr[mid]){
            return mid;
        }
        if (arr[start]<=arr[mid]){
            if (target>= arr[start] && target <= arr[mid]){
                end=mid-1;
                return search(arr,target,start,end);
            }
            else{
                start=mid+1;
                return search(arr,target,start,end);
            }
        }
        if (target >= arr[mid] && target <=arr[end]){
            start=mid-1;
            return search(arr,target,start,end);
        }
        else {
            end = mid - 1;
            return search(arr, target, start, end);
        }
    }
}
