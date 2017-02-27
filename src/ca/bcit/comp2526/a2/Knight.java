package ca.bcit.comp2526.a2;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

/**
 * Knight piece class.
 * @author Adrian Saldivar
 * @version 1.0
 * @see COMP2526 20172B
 */
public class Knight extends Piece {
    /**
     * Integer type for knight.
     */
    private final int type = KNIGHT;
    /**
     * Image for player 1 knight.
     */
    protected BufferedImage knight1;
    /**
     * Image for player 2 knight.
     */
    protected BufferedImage knight2;
    
    /**
     * Constructor for Knight.
     * @param type Player 1 or 2.
     */
    public Knight(final int type) {
        super(type);
    }


    /**
     * Set image for player 1 knight.
     */
    @Override
    void setBPiece() {
        try {
            knight1 = ImageIO.read(new File("pieces.png"));
            knight1 = knight1.getSubimage(type * 64, BLACK * 64, 64, 64);

        } catch (final Exception ex) {
            ex.printStackTrace();
            System.exit(1);
        }
        
    }

    /**
     * Set image for player 2 knight.
     */
    @Override
    void setWPiece() {
        try {
            knight2 = ImageIO.read(new File("pieces.png"));
            knight2 = knight2.getSubimage(type * 64, WHITE * 64, 64, 64);

        } catch (final Exception ex) {
            ex.printStackTrace();
            System.exit(1);
        }
        
    }

    /**
     * Returns player 2 knight.
     */
    @Override
    Image getBlackImg() {
        return knight1;
    }

    /**
     * Returns player 2 knight.
     * @return knight2 knight image
     */
    @Override
    Image getWhiteImg() {
        return knight2;
    }


}
