package ca.bcit.comp2526.a2;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

/**
 * Bishop piece class.
 * @author Adrian Saldivar
 * @version 1.0
 * @see COMP2526 20172B
 */
public class Bishop extends Piece {
    /**
     * Integer type for piece.
     */
    private final int type = BISHOP;
    /**
     * BufferedImage for player 1.
     */
    protected BufferedImage bishop1;
    /**
     * BufferedImage for player 2.
     */
    protected BufferedImage bishop2;
    
    /**
     * Constructor for bishop class.
     * @param type Player 1 or 2
     */
    public Bishop(final int type) {
        super(type);
    }

    /**
     * Sets black bishop image.
     */
    @Override
    void setBPiece() {
        try {
            bishop1 = ImageIO.read(new File("pieces.png"));
            bishop1 = bishop1.getSubimage(type * 64, BLACK * 64, 64, 64);
        } catch (final Exception ex) {
            ex.printStackTrace();
            System.exit(1);
        }
    }

    /**
     * Sets white bishop image.
     */
    @Override
    void setWPiece() {
        try {
            bishop2 = ImageIO.read(new File("pieces.png"));
            bishop2 = bishop2.getSubimage(type * 64, WHITE * 64, 64, 64);
        } catch (final Exception ex) {
            ex.printStackTrace();
            System.exit(1);
        }   
    }

    /**
     * Returns black bishop image.
     */
    @Override
    Image getBlackImg() {
        return bishop1;
    }
    
    /** 
     * Returns black bishop image.
     */
    @Override
    Image getWhiteImg() {
        return bishop2;
    }
}
