package com.BInary_Search;

public class spiral_matrix {
    public static void main(String[] args) {
        int nums[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int nums1[][]={{1,2,3},{4,5,6},{7,8,9}};
        int ans[]=new int[12];
        int ans1[]= SpiralMat(nums1,ans);

        for(int k=0;k<ans1.length;k++){
            System.out.print(ans1[k]+" ");
        }
    }
    static int[] SpiralMat(int[][] nums,int[] ans){
        int k=0;
        for (int row=0;row<nums.length;row++){
            int col=0;
            for (col=0;col<nums[0].length;col++){
                ans[k]=nums[row][col];
                k++;
            }
            col=col-1;
            for (int col1=row+1;col1<nums.length;col1++){
                ans[k]=nums[col1][col];
                k++;
            }
            for(int col1=col-1;col1>=0;col1--){
                ans[k]=nums[2][col1];
                k++;
            }
            for (int row2=0;row2<nums[0].length-1;row2++){
                ans[k]=nums[1][row2];
                k++;
            }
            break;
        }
        return ans;
    }
}
