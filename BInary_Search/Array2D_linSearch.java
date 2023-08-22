package com.BInary_Search;

public class Array2D_linSearch {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int target=9;
        int ans[]=SearchElement(arr,target);
        System.out.println(ans[0]+" "+ans[1]);
    }
    static int[] SearchElement(int arr[][],int target){
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                if(arr[i][j]==target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}

