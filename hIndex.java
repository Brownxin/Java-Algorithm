package Leetcode;

public class hIndex {
	public int hIndex(int[] citations){
		if(citations==null){
			return 0;
		}
		int low=0,high=citations.length-1;
		while(low<=high){
			int mid=low+(high-low)/2;
			if(citations.length-mid==citations[mid]){return mid;}
			else if(citations.length-mid<citations[mid]){
				low=mid+1;
			}
			else{
				high=mid-1;
			}
		}
		return citations.length-low;
	}
}
