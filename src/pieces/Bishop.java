package pieces;

import board.ChessBoard;
import board.Square;
import javafx.scene.paint.Color;

public class Bishop extends Piece {

	public Bishop(Color c) {
		super(c);
	}

	@Override
	public void showMove(int row, int col) {
		// TODO Auto-generated method stub

		int top = row;
		int down = 7 - row;
		int left = col;
		int right = 7 - col;

		// TOP RIGHT
		for (int i = 1; i <= Math.min(top, right); i++) {

			Square s = ChessBoard.all_squares.get(row - i).get(col + i);
			s.moveMark();
			if (s.hasPiece()) {
				break;
			}

		}

		// TOP LEFT
		for (int i = 1; i <= Math.min(top, left); i++) {

			Square s = ChessBoard.all_squares.get(row - i).get(col - i);
			s.moveMark();
			if (s.hasPiece()) {
				break;
			}

		}

		// DOWN RIGHT
		for (int i = 1; i <= Math.min(down, right); i++) {

			Square s = ChessBoard.all_squares.get(row + i).get(col + i);
			s.moveMark();
			if (s.hasPiece()) {
				break;
			}

		}

		// DOWN LEFT
		for (int i = 1; i <= Math.min(down, left); i++) {

			Square s = ChessBoard.all_squares.get(row + i).get(col - i);
			s.moveMark();
			if (s.hasPiece()) {
				break;
			}

		}

	}

	@Override
	public void move() {
		// TODO Auto-generated method stub

	}

}
