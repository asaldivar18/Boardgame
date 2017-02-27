package ca.bcit.comp2526.a2;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

/**
 * Queen piece class.
 * @author Adrian Saldivar
 * @version 1.0
 * @see COMP2526 20172B
 */
public class Rook extends Piece {

    /**
     * Integer type for Rook.
     */
    private final int type = ROOK;
    /**
     * Rook Image for player 1.
     */
    protected BufferedImage rook1;
    /**
     * Rook Image for player 2.
     */
    protected BufferedImage rook2;

    /**
     * Constructor for Rook.
     * @param type Player 1 or 2
     */
    public Rook(final int type) {
        super(type);
    }

    /**
     * Sets image for player 2 rook.
     */
    @Override
    void setBPiece() {
        try {
            rook1 = ImageIO.read(new File("pieces.png"));
            rook1 = rook1.getSubimage(type * 64, BLACK * 64, 64, 64);

        } catch (final Exception ex) {
            ex.printStackTrace();
            System.exit(1);
        }     
    }

    /**
     * Sets image for player 2 rook.
     */
    @Override
    void setWPiece() {
        try {
            rook2 = ImageIO.read(new File("pieces.png"));
            rook2 = rook2.getSubimage(type * 64, WHITE * 64, 64, 64);
        } catch (final Exception ex) {
            ex.printStackTrace();
            System.exit(1);
        }
    }

    /**
     * Returns Player 1 Rook.
     * @return rook1 Image
     */
    @Override
    Image getBlackImg() {
        return rook1;
    }

    /**
     * Returns Player 2 rook.
     * @return rook2 Image
     */
    @Override
    Image getWhiteImg() {
        return rook2;
    }
}
