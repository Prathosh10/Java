package com.BInary_Search;

public class smallest_letter {
    public static void main(String[] args) {
       char letters[]={'c','f','j'};
       char target='a';

       char ans=nextGreatestLetter(letters,target);
        System.out.println(ans);
    }
    static char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if (target<letters[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        //return letters[start%letters.length];
        if (start==letters.length){
            return letters[0];
        }
        else{
            return letters[start];
        }
    }
}
