package pieces;

import board.ChessBoard;
import board.Square;
import javafx.scene.paint.Color;

public class King extends Piece {

	public King(Color c) {
		super(c);
	}

	@Override
	public void showMove(int row, int col) {

		for (int j = 1; j <= 7 - col;) {

			Square s = ChessBoard.all_squares.get(row).get(col + 1);
			s.moveMark();
			break;

		}

		for (int j = 1; j <= col;) {

			Square s = ChessBoard.all_squares.get(row).get(col - 1);
			s.moveMark();
			break;

		}

		for (int j = 1; j <= row;) {

			Square s = ChessBoard.all_squares.get(row - 1).get(col);
			s.moveMark();
			break;

		}

		for (int j = 1; j <= 7 - row;) {

			Square s = ChessBoard.all_squares.get(row + 1).get(col);
			s.moveMark();
			break;

		}

		int top = row;
		int down = 7 - row;
		int left = col;
		int right = 7 - col;

		// TOP RIGHT
		for (int i = 1; i <= Math.min(top, right);) {

			Square s = ChessBoard.all_squares.get(row - 1).get(col + 1);
			s.moveMark();
			break;

		}

		// TOP LEFT
		for (int i = 1; i <= Math.min(top, left);) {

			Square s = ChessBoard.all_squares.get(row - 1).get(col - 1);
			s.moveMark();
			break;

		}

		// DOWN RIGHT
		for (int i = 1; i <= Math.min(down, right);) {

			Square s = ChessBoard.all_squares.get(row + 1).get(col + 1);
			s.moveMark();

			break;

		}

		// DOWN LEFT
		for (int i = 1; i <= Math.min(down, left);) {

			Square s = ChessBoard.all_squares.get(row + 1).get(col - 1);
			s.moveMark();

			break;

		}

	}

	@Override
	public void move() {
		// TODO Auto-generated method stub

	}

}
