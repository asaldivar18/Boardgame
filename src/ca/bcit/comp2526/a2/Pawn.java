package ca.bcit.comp2526.a2;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

/**
 * Pawn piece class.
 * @author Adrian Saldivar
 * @version 1.0
 * @see COMP2526 20172B
 */
public class Pawn extends Piece {
    private final int type = PAWN;
    protected BufferedImage pawn1;
    protected BufferedImage pawn2;
    
    /**
     * Constructor for pawn.
     * Calls to super class Piece.
     * @param Type Player 1 or 2
     */
    public Pawn(final int type) {
        super(type);
    }

    /**
     * Set pawn image for Player 1.
     */
    @Override
    void setBPiece() {
        try {
            pawn1 = ImageIO.read(new File("pieces.png"));
            pawn1 = pawn1.getSubimage(type * 64, BLACK * 64, 64, 64);

        } catch (final Exception ex) {
            ex.printStackTrace();
            System.exit(1);
        }
        
    }

    /**
     * Set pawn image for Player 2.
     */
    @Override
    void setWPiece() {
        try {
            pawn2 = ImageIO.read(new File("pieces.png"));
            pawn2 = pawn2.getSubimage(type * 64, WHITE * 64, 64, 64);

        } catch (final Exception ex) {
            ex.printStackTrace();
            System.exit(1);
        }
        
    }

    /**
     * Returns the Player 1 pawn image.
     * @retrun Image pawn1
     */
    @Override
    Image getBlackImg() {
        return pawn1;
    }

    /**
     * Returns the Player 2 pawn image.
     * @retrun Image pawn2
     */
    @Override
    Image getWhiteImg() {
        return pawn2;
    }

}
