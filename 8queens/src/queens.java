

public class queens {

	public static void main(String[] args) {
		int nQueens=8;
		
		//Initialize array
		int[]board = new int[nQueens];
		for(int i=0;i<board.length;i++) {
			board[i]=-1;
			
		}
		
		
		//place the first queen to get started
		int currentRow=0;
		board[currentRow]=0;
		currentRow++;
		int currentColumn=0;
		long solutions=0;
		
		while(currentRow>=0) {
			if(isValid(currentRow,currentColumn,board)) {
				board[currentRow]= currentColumn;
				currentRow++;
				currentColumn=0;
				
				
				//Board completed?
				if(currentRow>=board.length) {
					solutions++;
					System.out.println("Solution "+ solutions);
					printBoard(board);
					currentRow--;
					currentColumn=board[currentRow]+1;
				}
			}
			else {
				// if board is not valid
				currentColumn++;
				if(currentColumn>=board.length) {
					board[currentRow]=-1;
					currentRow--;
					if(currentRow>=0)
						currentColumn=board[currentRow]+1;
				}
			}
		}
		System.out.println("Number of solutions of "+ nQueens+ "queens is "+ solutions);

	}

	private static void printBoard(int[] board) {
		//Print board
		for(int i =0;i<board.length;i++) {
			for(int j=0; j<board.length;j++) {
				if(board[i]==j)
					System.out.print("|Q");
				else 
					System.out.print("| ");
				
			}
			System.out.println("|");
		}
		
	}

	private static boolean isValid(int currentRow, int currentColumn, int[] board) {
		if(currentColumn >=board.length) 
			return false;
		
		for(int i=0; i<currentRow; i++) {
			// check if current column appears in any other current row
			if(board[i]== currentColumn)
				return false;
			
			// check both diagnal
			if(Math.abs(currentRow-i)== Math.abs(currentColumn-board[i])) {
				return false;
			}
		}
		return true;
	}

}
