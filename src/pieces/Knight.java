package pieces;

import board.ChessBoard;
import javafx.scene.paint.Color;

public class Knight extends Piece {

	public Knight(Color c) {
		super(c);
	}

	@Override
	public void showMove(int row, int col) {
		// TODO Auto-generated method stub
		if (!(row + 1 > 7 || col + 2 > 7))
			ChessBoard.all_squares.get(row + 1).get(col + 2).moveMark();
		
		if (!(row + 1 > 7 || col - 2 < 0))
			ChessBoard.all_squares.get(row + 1).get(col - 2).moveMark();
		
		if (!(row + 2 > 7 || col + 1 > 7))
			ChessBoard.all_squares.get(row + 2).get(col + 1).moveMark();
		
		if (!(row + 2 > 7 || col - 1 < 0))
			ChessBoard.all_squares.get(row + 2).get(col - 1).moveMark();
		
		if (!(row - 1 < 0 || col + 2 > 7))
			ChessBoard.all_squares.get(row - 1).get(col + 2).moveMark();
		
		if (!(row - 1 < 0 || col - 2 < 0))
			ChessBoard.all_squares.get(row - 1).get(col - 2).moveMark();
		
		if (!(row - 2 < 0 || col + 1 > 7))
			ChessBoard.all_squares.get(row - 2).get(col + 1).moveMark();
		
		if (!(row - 2 < 0 || col - 1 < 0))
			ChessBoard.all_squares.get(row - 2).get(col - 1).moveMark();

	}

	@Override
	public void move() {
		// TODO Auto-generated method stub

	}

}
