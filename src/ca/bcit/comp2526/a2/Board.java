package ca.bcit.comp2526.a2;

/**
 * Chess Board.
 * Creates a JFrame 
 * @author Adrian Saldivar
 * @version 1.0
 * @see COMP2526 20172B
 */
public interface Board {

    /**
     * Integer to represent Queen.
     */
    static final int QUEEN = 0;
    
    /**
     * Integer to represent King.
     */
    static final int KING = 1;
    /**
     * Integer to represent Rook.
     */

    static final int ROOK = 2; 
    /**
     * Integer to represent Knight.
     */
    static final int KNIGHT = 3;
    /**
     * Integer to represent Bishop.
     */
    static final int BISHOP = 4;
    /**
     * Integer to represent Pawn.
     */
    static final int PAWN = 5;
    /**
     * Integer to represent Black.
     */
    static final int BLACK = 0;
    /**
     * Integer to represent King.
     */
    static final int WHITE = 1;
    /**
     * Integer to represent King.
     */
    static final int NONE = 3;
    
    /**
     * Order for set up.
     */
    public static final int[] ORDER = { ROOK, KNIGHT, BISHOP, KING, QUEEN, BISHOP, KNIGHT, 
    ROOK};
    
    /**
     * Tiles for the pieces.
    */
    Tiles[][] tile = new Tiles[8][8];

}
