package pieces;

import board.ChessBoard;
import board.Square;
import javafx.scene.paint.Color;

public class Rook extends Piece {

	public Rook(Color c) {
		super(c);

	}

	@Override
	public void showMove(int row, int col) {
		// TODO Auto-generated method stub

		for (int j = 1; j <= 7 - col; j++) {

			Square s = ChessBoard.all_squares.get(row).get(col + j);
			s.moveMark();
			if (s.hasPiece()) {
				break;
			}

		}

		for (int j = 1; j <= col; j++) {

			Square s = ChessBoard.all_squares.get(row).get(col - j);
			s.moveMark();
			if (s.hasPiece()) {
				break;
			}

		}

		for (int j = 1; j <= row; j++) {

			Square s = ChessBoard.all_squares.get(row - j).get(col);
			s.moveMark();
			if (s.hasPiece()) {
				break;
			}

		}

		for (int j = 1; j <= 7 - row; j++) {

			Square s = ChessBoard.all_squares.get(row + j).get(col);
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
