package com.Recursion.Arrays;

public class rotated_Binary_search {
    public static void main(String[] args) {
        int arr[]={5,6,7,8,1,2,3,4};
        int target=5;

        int ans=search(arr,target,0, arr.length-1);
        System.out.println(ans);
    }
    static int search(int arr[],int target,int start,int end){
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
/* this will applicable for (start < mid )
1. if arr[start]<= arr[mid]
	1. if key(target) >= arr[start] & <= arr[mid]
		1. then, we put end=mid-1;
2. else start=mid+1;

// test case 2:
This will only applicable for (mid<start)
1. if key(target)>= arr[mid] & <= arr[end]
	1. start=mid-1
2. else end=mid-1
*/