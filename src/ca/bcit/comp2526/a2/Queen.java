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
public class Queen extends Piece {

    /**
     * Integer type for Queen.
     */
    private final int type = QUEEN;
    /**
     * Image for  player 1.
     */
    protected BufferedImage queen1;
    /**
     * Image for player 2.
     */
    protected BufferedImage queen2;
    
    /**
     * Constructor class for Queen.
     * @param type Player 1 or 2.
     */
    public Queen(final int type) {
        super(type);
    }




    /**
     * Sets image for Player 1 queen.
     */
    @Override
    void setBPiece() {
        try {
            queen1 = ImageIO.read(new File("pieces.png"));
            queen1 = queen1.getSubimage(type * 64, BLACK * 64, 64, 64);

        } catch (final Exception ex) {
            ex.printStackTrace();
            System.exit(1);
        }
        
    }

    /**
     * Sets image for Player 2 queen.
     */
    @Override
    void setWPiece() {
        try {
            queen2 = ImageIO.read(new File("pieces.png"));
            queen2 = queen2.getSubimage(type * 64, WHITE * 64, 64, 64);

        } catch (final Exception ex) {
            ex.printStackTrace();
            System.exit(1);
        }

    }

    /**
     * Get player1 image.
     */
    @Override
    Image getBlackImg() {
        return queen1;
    }
    
    /**
     * Get player2 image.
     */
    @Override
    Image getWhiteImg() {
        return queen2;
    }

}
