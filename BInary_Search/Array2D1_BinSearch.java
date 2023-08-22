package com.BInary_Search;

import java.util.Arrays;

public class Array2D1_BinSearch {
    public static void main(String[] args) {
        int nums[][]={{10,11,12},
                {20,21,22},
                {30,31,32}
        };
        System.out.println(Arrays.toString(Search(nums,31)));

    }

    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] Search(int[][] matrix,int target){
        int row=matrix.length;
        int col=matrix[0].length;

        if(row==1){
            return binarySearch(matrix,0,0,col-1,target);
        }

        int rStart=0;
        int rEnd=row-1;
        int cMid=col/2;

        //run the loop till 2 rows are remaining
        while (rStart <(rEnd-1)){
            int mid=rStart +(rEnd-rStart)/2;
            if(matrix[mid][cMid]==target)
                return new int[]{mid,cMid};
            if (matrix[mid][cMid] < target){
                rStart=mid;
            }else{
                rEnd=mid;
            }
        }
        // now we have two rows
        //check whether the target is in the col of 2 rows
        if (matrix[rStart][cMid]== target){
            return new int[]{rStart,cMid};
        }
        if (matrix[rStart+1][cMid]==target){
            return new int[]{rStart+1,cMid};
        }

        //search in first half
        if (target<=matrix[rStart][cMid-1]){
            return binarySearch(matrix,rStart,0,cMid-1,target);
        }
        //search in 2nd half
        if (target>=matrix[rStart][cMid+1]){
            return binarySearch(matrix,rStart,cMid+1,col-1,target);
        }
        //search in 3rd half
        if (target<=matrix[rStart+1][cMid-1]){
            return binarySearch(matrix,rStart+1,0,cMid-1,target);
        }
        //search in 4th half
        else{
            return binarySearch(matrix, rStart + 1, cMid + 1, col - 1, target);
        }
    }
}


