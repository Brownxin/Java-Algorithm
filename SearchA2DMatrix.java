package Leetcode;

public class SearchA2DMatrix {
	public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null){
        	return false;
        }
        int m=matrix.length,n=matrix[0].length,row=m-1,col=0;
        while(row<m && col>=0){
        	if(target==matrix[row][col]){
        		return true;
        	}
        	else if(target>matrix[row][col]){
        		col++;
        	}
        	else{
        		row--;
        	}
        }
        return false;
    }
}
