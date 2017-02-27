package ca.bcit.comp2526.a2;

import java.awt.Image;

/**
 * Player class.
 * Has all the pieces for Chess.java.
 * @author Adrian Saldivar
 * @version 1.0
 * @see COMP2526 20172B
 */
public class Player {
    /**
     * Player 2 bishop.
     */
    private static Piece wBishop;
    /**
     * Player 2 king.
     */
    private static Piece wKing;
    /**
     * Player 2 knight.
     */
    private static Piece wKnight;
    /**
     * Player 2 pawn.
     */
    private static Piece wPawn;
    /**
     * Player 2 rook.
     */
    private static Piece wRook;
    /**
     * Player 2 queen.
     */
    private static Piece wQueen;
    /**
     * Player 1 bishop.
     */
    private static Piece bBishop;
    /**
     * Player 1 king.
     */
    private static Piece bKing;
    /**
     * Player 1 knight.
     */
    private static Piece bKnight;
    /**
     * Player 1 pawn.
     */
    private static Piece bPawn;
    /**
     * Player 1 queen.
     */
    private static Piece bRook;
    /**
     * Player 1 queen.
     */
    private static Piece bQueen;
    /**
     * Array of piece images.
     */
    private static final Image[][] chessPieceImages = new Image[2][6];
    
    /**
     * Constructor for Player.
     * Takes an integer as a parameter to distinguish player 1 or player 2.
     * @param player 1 or 2.
     */
    public Player(final int player) {
        if (player == 0) {
            setBlack();
        }
        if (player == 1) {
            setWhite();
        }
    }
    
    /**
     * Sets player 1.
     */
    private void setBlack() {
        bBishop = new Bishop(Piece.BLACK);
        bKing = new King(Piece.BLACK);
        bKnight = new Knight(Piece.BLACK);
        bPawn = new Pawn(Piece.BLACK);
        bRook = new Rook(Piece.BLACK);
        bQueen = new Queen(Piece.BLACK);
        getplayer1img();   
    }
    
    /**
     * Sets player 2.
     */
    private void setWhite() {
        wBishop = new Bishop(Piece.WHITE);
        wKing = new King(Piece.WHITE);
        wKnight = new Knight(Piece.WHITE);
        wPawn = new Pawn(Piece.WHITE);
        wRook = new Rook(Piece.WHITE);
        wQueen = new Queen(Piece.WHITE);
        getplayer2img();
    }
    
    /**
     * Gets player 2 piece images.
     */
    private void getplayer2img() {
        chessPieceImages[Piece.WHITE][Piece.QUEEN] = wQueen.getWhiteImg();
        chessPieceImages[Piece.WHITE][Piece.KING] = wKing.getWhiteImg();
        chessPieceImages[Piece.WHITE][Piece.ROOK] = wRook.getWhiteImg();
        chessPieceImages[Piece.WHITE][Piece.KNIGHT] = wKnight.getWhiteImg();
        chessPieceImages[Piece.WHITE][Piece.BISHOP] = wBishop.getWhiteImg();
        chessPieceImages[Piece.WHITE][Piece.PAWN] = wPawn.getWhiteImg();
    }
    
    /**
     * Gets player 1 piece images.
     */
    private void getplayer1img() {
        chessPieceImages[Piece.BLACK][Piece.QUEEN] = bQueen.getBlackImg();
        chessPieceImages[Piece.BLACK][Piece.KING] = bKing.getBlackImg();
        chessPieceImages[Piece.BLACK][Piece.ROOK] = bRook.getBlackImg();
        chessPieceImages[Piece.BLACK][Piece.KNIGHT] = bKnight.getBlackImg();
        chessPieceImages[Piece.BLACK][Piece.BISHOP] = bBishop.getBlackImg();
        chessPieceImages[Piece.BLACK][Piece.PAWN] = bPawn.getBlackImg();
    }

    /**
     * Returns piece image.
     * @param xpos player 1 or player 2
     * @param ypos piece type
     * @return piece image
     */
    public static Image getChessPieceImages(final int xpos, final int ypos) {
        return chessPieceImages[xpos][ypos];
    }
    
}
