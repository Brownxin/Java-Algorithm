package Leetcode;

public class ContainerWithMostWater {
	public int maxArea(int[] height) {
        if(height==null){
        	return 0;
        }
        int left=0;
        int right=height.length-1;
        int res=Integer.MIN_VALUE;
        while(left<right){
        	int tmp=Math.min(height[left],height[right])*(right-left);
        	res=Math.max(res,tmp);
        	if(height[left]>height[right]){
        		right--;
        	}
        	else{
        		left++;
        	}
        }
        return res;
    }
}
