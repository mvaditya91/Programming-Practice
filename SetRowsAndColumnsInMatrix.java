import java.util.Arrays;


public class SetRowsAndColumnsInMatrix {
	
	
	private static void replaceWithZero(int[][] replacematrix) {
		int rows = replacematrix.length;
		int columns = replacematrix[0].length;
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				if(replacematrix[i][j] == -1) {
					replacematrix[i][j]=0;
				}
			}
		}
	}
	
	private static void resetRowsAndColumns(int[][] orgmatrix,int rows,int columns,int iLoc,int jLoc) {
		
		for(int j=0;j<columns;j++) {
		if(orgmatrix[iLoc][j]!=0) {
			orgmatrix[iLoc][j] = -1;
		}
		}
		
		for(int i=0;i<rows;i++) {
			if(orgmatrix[i][jLoc]!=0) {
				orgmatrix[i][jLoc] = -1;
			}
		}
	}
	
	private static void checkForZero(int[][] orgMatrix) {
		
		int rows = orgMatrix.length;
		int columns = orgMatrix[0].length;
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				if(orgMatrix[i][j] == 0) {
					//System.out.println("Coordinates of 0's are: ("+i+","+j+")");
					resetRowsAndColumns(orgMatrix,rows,columns,i,j);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] originalMatrix = {
				{1,1,1,0},
				{0,1,1,1},
				{1,1,1,1},
				{1,1,1,1}
				};
		
		// check for 0's
		checkForZero(originalMatrix);
		//Replace -1's with 0
		replaceWithZero(originalMatrix);
		
		for(int i=0;i<originalMatrix.length;i++) {
			System.out.println(Arrays.toString(originalMatrix[i]));
		}
	}

}
