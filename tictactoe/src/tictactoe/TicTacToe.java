package tictactoe;

public class TicTacToe {
	private char[][] board = {{'\0', '\0', '\0'},{'\0', '\0', '\0'},{'\0', '\0', '\0'}};
		public void play(int x, int y) {
		checkAxis(x,0);
		checkAxis(y, 1);
		setBox(x, y);
		}
		
		private void checkAxis(int position,int axis) {
			if (position < 1 || position > 3) {
			if (axis==0) throw new RuntimeException("X is outside board");
			else throw new RuntimeException("Y is outside board");
			}
			}
		
	private void setBox(int x,int y)
	{
		if (board[x - 1][y - 1] != '\0') {
			throw new RuntimeException("Box is occupied");
			} else {
			board[x - 1][y - 1] = 'X';
			}
	}
}
