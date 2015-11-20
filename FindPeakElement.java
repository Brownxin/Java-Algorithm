package Leetcode;

import java.util.ArrayList;

public class FindPeakElement {
//	Solution 2
	public int findPeakElement(int[] nums) {
		int left=0,right=nums.length-1;
		while(left<=right){
			if(left==right){
				return left;
			}
			if(left+1==right){
				if(nums[left]>nums[right]){return left;}
				if(nums[left]<nums[right]){return right;}
			}
			int mid=(left+right)/2;
			if(nums[mid]<nums[mid-1]){
				right=mid-1;
			}
			else if(nums[mid]<nums[mid+1]){
				left=mid+1;
			}
			else{return mid;}
		}
		return left;
	}
//	Solution 1
//	public int binarySearch(int left,int right,int[] nums){
//		if(left==right) {return left;}
//		if(left+1==right){
//			if(nums[left]>nums[right]){return left;}
//			if(nums[left]<nums[right]){return right;}
//		}
//		int mid=left+(right-left)/2;
//		if(nums[mid]<nums[mid-1]){
//			return binarySearch(left,mid-1,nums);
//		}
//		else if(nums[mid]<nums[mid+1]){
//			return binarySearch(mid+1,right,nums);
//		}
//		return mid;
//	}
//	public int findPeakElement(int[] nums) {
//        return binarySearch(0,nums.length-1,nums);
//    }
}
