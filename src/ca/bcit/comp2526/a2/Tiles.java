package ca.bcit.comp2526.a2;

import javax.swing.JButton;

/**
 * Tiles class.
 * JButton to represent a tile.
 * @author Adrian Saldivar
 * @version 1.0
 * @see COMP2526 20172B
 */
public class Tiles extends JButton {
    
    /**
     * x Point for Board.
     */
    protected int ix;
    /**
     * y Point for Board.
     */
    protected int jx;
    /**
     * If tile is empty.
     */
    protected boolean empty = true;
    /**
     * Player 1 or Player 2.
     */
    protected int type;
    

    /**
     * Serial version UID.
     */
    private static final long serialVersionUID = 1L;
    
    public Tiles() {
        final int ix;
        final int jx;
    }
    
    /**
     * Sets the  final x Point of the tile.
     * @param ix  x point
     */
    public void setTiles_i(final int ix) {    
        this.ix = ix;
    }
    
    /**
     * Sets the final y Point of the tile.
     * @param jx y point
     */
    public void setTiles_j(final int jx) {    
        this.jx = jx;
    }

    /**
     * Returns x position of tile.
     * @return ix
     */
    public int getTiles_i() {    
        return ix;
    }
    
    /**
     * Returns y position of the tile.
     * @return jx
     */
    public int getTiles_j() {    
        return jx;
    }
    
    /**
     * Returns true if tile is empty.
     * @return empty
     */
    public boolean isempty() {
        return empty;
    }
}
