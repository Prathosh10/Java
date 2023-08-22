package com.BInary_Search;

public class findFirstAnsLastPosition {
    public static void main(String[] args) {
        int nums[]={5,7,7,7,7,8,8,10};
        int target=8;

        int ans[]=search_range(nums,target);
        for(int i=0;i<2;i++){
            System.out.print(ans[i]+" ");
        }
    }
    static int[] search_range(int nums[],int target){
        int ans[]={-1,-1};
        int start=search(nums,target,true);
        int end=search(nums,target,false);

        ans[0]=start;
        ans[1]=end;
        return ans;
    }
    static int search(int nums[],int target,boolean findStartIndex){
        int ans=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;

            if (target<nums[mid]){
                end=mid-1;
            }
            else if(target>nums[mid]){
                start=mid+1;
            }
            else{ // this place (start and end finding place) to use traverse)
                ans=mid;
                if(findStartIndex){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
