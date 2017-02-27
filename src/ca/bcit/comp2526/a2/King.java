package ca.bcit.comp2526.a2;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

/**
 * King piece class.
 * @author Adrian Saldivar
 * @version 1.0
 * @see COMP2526 20172B
 */
public class King extends Piece {
    /**
     * Integer type for piece.
     */
    private final int type = KING;
    /**
     * Image for player 1.
     */
    protected BufferedImage king1;
    /**
     * Image for player 2.
     */
    protected BufferedImage king2;

    /**
     * Constructor for King class.
     * @param type Player 1 or 2
     */
    public King(final int type) {
        super(type);
    }

    /**
     * Set image for player1 king.
     */
    @Override
    void setBPiece() {
        try {
            king1 = ImageIO.read(new File("pieces.png"));
            king1 = king1.getSubimage(type * 64, BLACK * 64, 64, 64);
        } catch (final Exception ex) {
            ex.printStackTrace();
            System.exit(1);
        } 
    }

    /**
     * Set image for player2 king.
     */
    @Override
    void setWPiece() {
        try {
            king2 = ImageIO.read(new File("pieces.png"));
            king2 = king2.getSubimage(type * 64, WHITE * 64, 64, 64);
        } catch (final Exception ex) {
            ex.printStackTrace();
            System.exit(1);
        }   
    }

    /**
     * Returns player1 king. 
     */
    @Override
    Image getBlackImg() {
        return king1;
    }
    
    /**
     * Returns player2 king.
     */
    @Override
    Image getWhiteImg() {
        return king2;
    }


}
