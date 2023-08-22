package com.BInary_Search;

public class Order_Agnostic {
    public static void main(String[] args) {
        int arr[]={44,33,20,10,8,7,6,5,4,3,2,1};
        int target=80;
        int ans=BinDec(arr,target);
        System.out.println(ans);
    }

    static int BinDec(int arr[],int target){
        int start=0;
        int end=arr.length-1;

        boolean isAscen=arr[start]<arr[end]; // for find array is ascending or descending
        while(start <= end){
            int mid=start+(end-start)/2;
            if (arr[mid]== target){
                return mid;
            }

            if (isAscen){
                if (target < arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if(target>arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}
