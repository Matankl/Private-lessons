package tirgul_06;

public class ExQueens {
public static final int LEN = 8;
	
	/**
	 * check if current cell is safe from other qeens on the borad
	 * @param board
	 * @param row
	 * @param col
	 */
	public static boolean isSafeCell(boolean[][] board, int row, int col)
	{
		// check plus
		for (int i = 0; i < LEN; i++)
		{
			// if there is a queen on the row or on the col the cell is not safe
			if (board[row][i] || board[i][col])
				return (false);
		}
		
		return (checkCrossClear(board, row, col));
	}
	
	/**
	 * check if the cross path is clear
	 * @param board
	 * @param row
	 * @param col
	 * @return
	 */
	public static boolean checkCrossClear(boolean[][] board, int row, int col)
	{
		int colMore = col - row;	// take back number of rows
		int colLess = col + row;	// ass the row number, by moves
		// check one part
		for (int i = 0; i < LEN; i++)
		{
			// if the current moved cell for add is in range 
			// if in range and there is a queen then the cell is not safe
			if (colMore >= 0 && colMore < LEN && board[i][colMore])
				return false;
			if (colLess >= 0 && colLess < LEN && board[i][colLess])
				return false;
			
			colMore++;
			colLess--;
		}
		
		return (true);
	}
	
	public static void printBoard(boolean[][] board)
	{
		// print the upper line
		System.out.print("    ");
		for (int i = 0; i < LEN; i++)
		{
			System.out.print("  " + i + "  ");
		}
		System.out.println("\n");
		
		// print the board content
		for (int i = 0; i < board.length; i++)
		{
			System.out.print(i + "   ");
			for (int j = 0; j < board[i].length; j++)
			{
				System.out.print("  " + (board[i][j] ? "Q" : "-") + "  ");
			}
			
			System.out.println("\n");
		}
	}
	
	public static void solveQueens(boolean[][] board, int row)
	{
		if (row == board.length)
		{
			System.out.println();
		
			printBoard(board);
			
			System.out.println("\n-----------------------------------------------\n");
			return;
		}
		
		for (int i = 0; i < board[row].length; i++)
		{
			if (isSafeCell(board, row, i))
			{
				board[row][i] = true;
				solveQueens(board, row + 1);
				board[row][i] = false;
			}
		}
	}
	
	public static void solveQueens()
	{
		boolean[][] board = new boolean[LEN][LEN];
		solveQueens(board, 0);
	}
	
	public static void main(String[] args)
	{
//		Random r = new Random();
//		
//		boolean[][] board = new boolean[LEN][LEN];
//		for (int i = 0; i < board.length; i++)
//			for (int j = 0; j < board[i].length; j++)
//				board[i][j] = r.nextBoolean();
//		
//		printBoard(board);
		solveQueens();
	}
}
