package assignment;

public class Assignment37 {
//sum of the Matrix
	public static void main(String[] args) {
		int [][]matrixA= {{1,2,3},{4,5,6},{7,8,9}};
		int[][] matrixB= {{4,5,6},{2,7,8},{3,1,9}};
		
		int ROW=3;
		int COLUMN =3;
		
		int [][]result= new int [ ROW][COLUMN];
		System.out.println("Result of matrix is:  ");
		for (int i = 0; i < ROW; i++) {
			for (int j = 1; j < COLUMN; j++) {
				result[i][j]=matrixA[i][j]+matrixB[i][j];
				System.out.println(result[i][j]+"  ");
			}
			System.out.println();
		}
	}
}

