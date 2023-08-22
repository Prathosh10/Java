package com.BInary_Search;

public class Array2D_BinSearch {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
       // int arr[][]={{1,3}};
        int target=8;
        int ans[]=SearchElement(arr,target);
        System.out.println(ans[0]+" "+ans[1]);
    }
    static int[] SearchElement(int arr[][],int target){
        int r=0;
        int c=arr.length-1;

        while(r<arr.length && c>=0){
            if (arr[r][c]==target){
                return new int[]{r,c};
            }
            if (arr[r][c]<target){
                r++;
            }
            else {
                c--;
            }
        }
        return new int[] {-1,-1};
    }
}

