/*
	 * Determine if a 9x9 Sudoku board is valid. Only the filled cells need to be
	 * validated according to the following rules:
	 * 
	 * Each row must contain the digits 1-9 without repetition. Each column must
	 * contain the digits 1-9 without repetition. Each of the 9 3x3 sub-boxes of the
	 * grid must contain the digits 1-9 without repetition.
	 * 
	 * A partially filled sudoku which is valid.
	 * 
	 * The Sudoku board could be partially filled, where empty cells are filled with
	 * the character '.'.
	 * 
	 * Example 1:
	 * 
	 * Input: [ ["5","3",".",".","7",".",".",".","."],
	 * ["6",".",".","1","9","5",".",".","."], [".","9","8",".",".",".",".","6","."],
	 * ["8",".",".",".","6",".",".",".","3"], ["4",".",".","8",".","3",".",".","1"],
	 * ["7",".",".",".","2",".",".",".","6"], [".","6",".",".",".",".","2","8","."],
	 * [".",".",".","4","1","9",".",".","5"], [".",".",".",".","8",".",".","7","9"]
	 * ] Output: true Example 2:
	 * 
	 * Input: [ ["8","3",".",".","7",".",".",".","."],
	 * ["6",".",".","1","9","5",".",".","."], [".","9","8",".",".",".",".","6","."],
	 * ["8",".",".",".","6",".",".",".","3"], ["4",".",".","8",".","3",".",".","1"],
	 * ["7",".",".",".","2",".",".",".","6"], [".","6",".",".",".",".","2","8","."],
	 * [".",".",".","4","1","9",".",".","5"], [".",".",".",".","8",".",".","7","9"]
	 * ] Output: false Explanation: Same as Example 1, except with the 5 in the top
	 * left corner being modified to 8. Since there are two 8's in the top left 3x3
	 * sub-box, it is invalid.
	 */

class Solution {
    public boolean isValidSudoku(char[][] board) {

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (board[i][j] != '.') {
					if (!valid(i, j, board)) {
						return false;
					}
				}
			}
		}

		return true;

	}

	private boolean valid(int i, int j, char[][] board) {

		// check for row
		for (int p = 0; p < 9; p++) {
			if (board[i][j] == board[p][j] && p != i) {
				return false;
			}

		}
		// check for column
		for (int p = 0; p < 9; p++) {
			if (board[i][j] == board[i][p] && p != j) {
				return false;
			}

		}
		
		// check for sub square
		
        int r=i-i%3;
        int c=j-j%3;
		for (int p = r; p < r+3; p++) {
			for (int q = c; q < c+3; q++) {
				if(board[p][q]==board[i][j] && p!=i && q!=j)
                    return false;
			
			}

		}

		return true;
	}
}
