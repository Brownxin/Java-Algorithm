package Leetcode;

public class SpiralMatrixII {
	public int[][] generateMatrix(int n) {
	        int[][] res=new int[n][n];
	        int direct=0;
	        int num=1,up=0,down=n-1,left=0,right=n-1;
	        while(true){
	        	if(direct==0){
	        		for(int i=left;i<=right;i++){
	        			res[up][i]=num;
	        			num++;
	        		}
	        		up++;
	        	}
	        	if (direct==1){
	        		for(int i=up;i<=down;i++){
	        			res[i][right]=num;
	        			num++;
	        		}
	        		right--;
	        	}
	        	if(direct==2){
	        		for(int i=right;i>=left;i--){
	        			res[down][i]=num;
	        			num++;
	        		}
	        		down--;
	        	}
	        	if(direct==3){
	        		for(int i=down;i>=up;i--){
	        			res[i][left]=num;
	        			num++;
	        		}
	        		left++;
	        	}
	        	if(up>down || left>right){return res;}
	        	direct=(direct+1)%4;
	        }
	    }
}
