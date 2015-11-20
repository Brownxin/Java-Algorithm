package Leetcode;

public class setZeros {
	public void setZeros(int[][] matrix){
		boolean[] dp1=new boolean[matrix.length];
		boolean[] dp2=new boolean[matrix[0].length];
		
		for(int i=0;i<matrix.length;i++){
			dp1[i]=true;
		}
		for(int i=0;i<matrix[0].length;i++){
			dp2[i]=true;
		}
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				if(matrix[i][j]==0){
					dp1[i]=false;
					dp2[j]=false;
				}
			}
		}
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				if(dp1[i]==false || dp2[j]==false){
					matrix[i][j]=0;
				}
			}
		}
	}
}
