package Leetcode;

import java.util.Collections;

public class RotateImage {
	public void rotate(int[][] matrix) {
			int m=matrix.length;
			int n=matrix[0].length;
			for(int i=0;i<m;i++){
				for(int j=i+1;j<n;j++){
					int tmp=matrix[i][j];
					matrix[i][j]=matrix[j][i];
					matrix[j][i]=tmp;
				}
			}
			for(int i=0;i<m;i++){
				reverse(matrix[i]);
			}
	}

	private void reverse(int[] tempArray) {
		// TODO Auto-generated method stub
		int l=tempArray.length;
		for(int i=0;i<l/2;i++){
			int tmp=tempArray[i];
			tempArray[i]=tempArray[l-i-1];
			tempArray[l-i-1]=tmp;
		}
	}
}
