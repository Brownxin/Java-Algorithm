package Leetcode;

public class SearchinRotatedSortedArrayII {
	public boolean search(int[] nums,int target){
		if(nums==null){
			return false;
		}
		int low=0,high=nums.length-1;
		while(low<=high){
			int mid=low+(high-low)/2;
			if(nums[mid]==target){
				return true;
			}
			else if(nums[mid]==nums[low] && nums[mid]==nums[high]){
				low++;high--;
			}
			else if(nums[low]<nums[mid]){
				if(nums[mid]>target){
					high=mid-1;
				}
				else{
					low=mid+1;
				}
			}
			else if(nums[high]>nums[mid]){
				if(nums[mid]<target){
					low=mid+1;
				}
				else{
					high=mid-1;
				}
			}
		}
		return false;
	}
}
