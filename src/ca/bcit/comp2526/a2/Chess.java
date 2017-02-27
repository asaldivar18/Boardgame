package ca.bcit.comp2526.a2;

/**
 * Chess.java
 * Creates two players.
 * @author Adrian Saldivar
 * @version 1.0
 * @see COMP2526 20172B
 */

public class Chess {
    /**
     * Player 1.
     */
    private final Player black;
    /**
     * Player 2.
     */
    private final Player white;
    /**
     * Chess Board.
     */
    private Board chessboard;

    /**
     * Constructor for chess.
     */
    public Chess() {
        black = new Player(Piece.BLACK);
        white = new Player(Piece.WHITE);
    }
}
