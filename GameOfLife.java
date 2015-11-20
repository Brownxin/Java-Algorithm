package Leetcode;



public class GameOfLife {
	public int getStatus(int x,int y, int[][] matrix){
		if(x<0 || y<0 || x>matrix.length-1 || y>matrix[0].length-1){
			return 0;
		}
		return matrix[x][y]&1;
	}
	public void gameOfLife(int[][] board) {
        int[] dx={-1,-1,-1,0,0,1,1,1};
        int[] dy={-1,0,1,-1,1,-1,0,1};
        for(int i=0;i<board.length;i++){
        	for(int j=0;j<board[0].length;j++){
        		int lives=0;
        		for(int k=0;k<8;k++){
        			lives+=getStatus(i+dx[k],j+dy[k],board);
        		}
        		if(board[i][j]+lives==3 || lives==3){
        			board[i][j]|=2;
        		}
        	}
        }
        for(int i=0;i<board.length;i++){
        	for(int j=0;j<board[0].length;j++){
        		board[i][j]>>=1;
        	}
        }
    }
}
