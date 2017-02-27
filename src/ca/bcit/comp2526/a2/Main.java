package ca.bcit.comp2526.a2;

/**
 * Chess game
 * @author Adrian Saldivar
 * @version 1.0
 * @see COMP2526 20172B
 *
 */
public class Main {

    /**
     * Main class.
     * @param args command line arguments.
     */
    public static void main(final String[] args) {
        run();
    }

    /**
     * Starts the game.
     */
    private static void run() {
        final Chess game = new Chess();
        final Board chessboard = new ChessBoard();
    }
}
