package aplication;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		
		ChessMatch chessMatch = new ChessMatch();
		//Método que recebe a matriz de peças da partida
		UI.printBoard(chessMatch.getPieces());
	}
}