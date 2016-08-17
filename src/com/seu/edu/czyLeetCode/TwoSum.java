package com.seu.edu.czyLeetCode;
import java.util.*;
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int i=0;
        int j=0;
        int sum=Integer.MAX_VALUE;
        int[] result=new int[2];
        if(nums==null){
            return null;
        }
        for(i=0;i<nums.length;i++){
            for(j=i+1;j<nums.length;j++){
                sum=nums[i]+nums[j];
                if(sum==target){
                    result[0]=i;
                    result[1]=j;
                    return result;
                    //result=Arrays.copyOfRange(nums,i,j+1);
                }
            }
        }
        return result;
}
    public int[] twoSum2(int[] nums, int target) {
        int[] nums_sorted=new int[nums.length];
        System.arraycopy(nums,0,nums_sorted,0,nums.length);
        //Quicksort.
        Arrays.sort(nums_sorted);

        //Find the two numbers. O(n)
        int start=0;
        int end=nums_sorted.length;
        while(start<end){
            while(nums_sorted[start]+nums_sorted[--end]>target);
            if(nums_sorted[end]+nums_sorted[start]==target)
                break;
            while(nums_sorted[++start]+nums_sorted[end]<target);
            if(nums_sorted[end]+nums_sorted[start]==target)
                break;
        }

        //find the indices of the two numbers
        int[] ret=new int[2];
        int index=0;
        int a=nums_sorted[start];
        int b=nums_sorted[end];
        for(int i=0;i<nums.length;i++)
            if(nums[i]==a || nums[i]==b)
                ret[index++]=i;
        return ret;
    }
}

