package ca.bcit.comp2526.a2;

import java.awt.Image;

public abstract class Piece {
    
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
     * Piece constructor sets Player 1 or Player 2.
     * @param type 1 or 0.
     */
    public Piece(final int type) {
        if (type == 0) {
            setBPiece();
        }
        if (type == 1) {
            setWPiece();
        }
        if (type != 0 || type != 0) {
            //error handling here
        }
    }

    /**
     * Sets Player 1 Image.
     */
    abstract void setBPiece();
    
    /**
     * Sets Player 2 Image.
     */
    abstract void setWPiece();
    
    /**
     * Returns Player 2 Image.
     * @return Piece Image
     */
    abstract Image getBlackImg();
    
    /**
     * Returns Player 2 Image.
     * @return Piece Image
     */
    abstract Image getWhiteImg();

}
