package ca.bcit.comp2526.a2;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 * Chess Board. 
 * Creates a JFrame, tiles and handles mouse events on Tiles.
 * 
 * @author Adrian Saldivar
 * @version 1.0
 * @see COMP2526 20172B
 *
 */
public class ChessBoard extends JFrame implements Board {

    /**
     * Serial Version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Point for temporary reference to be assigned to.
     */
    private static Point temp = null;
    
    /**
     * ChessBoard Constructor.
     * Creates a JFrame window.
     */
    public ChessBoard() {
        super("CHESS");
        setSize(800, 800);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new GridLayout(0, 8));
        createTiles();
        addPieces();
        setVisible(true);
    }
    
    /**
     * Sets up the board.
     */
    private void addPieces() {
        setPlayer1();
        setPlayer2();
    }
    
    /**
     * Adds tiles to JFrame. 
     */
    public void addTiles() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                add(tile[j][i]);
            }
        }
    }
    
    /**
     * Sets tiles
     * Creates and add adds a Mouse listener.
     */
    private void createTiles() {
        for (int i = 0; i < tile.length; i++) {
            for (int j = 0; j < tile.length; j++) {
                final Tiles b = new Tiles();
                
                //set location of the tile.
                b.setTiles_i(i);
                b.setTiles_j(j);
                
                //set background color of tile.
                if (j % 2 == 1 && i % 2 == 1 || (j % 2 == 0 && i % 2 == 0)) {
                    b.setBackground(Color.WHITE);
                } else {
                    b.setBackground(Color.BLACK);
                }
                
                //mouse listener is made.
                b.addMouseListener(new MouseAdapter() {
                    /**
                    * mouseClicked event handler.
                    * @param ex MouseEvent
                    */
                    @Override
                    public void mouseClicked(final MouseEvent ex) {
                        final Point set = new Point(b.getTiles_i(), b.getTiles_j());
                        if (temp == null && tile[(int) set.getX()][(int) set.getY()].empty 
                                 == false) {
                            temp = set;
                        } else if (temp != null) {
                            moveTo(set);
                        }
                    }
                    
                    /**
                     * Point for TempPoint to move to.
                     * @param ax Point
                     */
                    public void moveTo(final Point ax) {
                        if (temp.equals(ax)) {
                            temp = null;
                        }
                        if (temp != null) {
                            tile[(int) ax.getX()][(int) ax.getY()]
                                    .setIcon(tile[(int) temp.getX()][(int) temp.getY()].getIcon());
                            tile[(int) temp.getX()][(int) temp.getY()].setIcon(null);
                            tile[(int) ax.getX()][(int) ax.getY()].empty = false;
                            tile[(int) temp.getX()][(int) temp.getY()].empty = true;
                            temp = null;
                        }
                    }
                });
                tile[i][j] = b;
            }
        }
        addTiles();
    }
    
    /**
     *  Add black pieces and black pawns.
     */
    private void setPlayer2() {
        for (int i = 0; i < ORDER.length; i++) {
            tile[i][BLACK].setIcon(new ImageIcon(Player.getChessPieceImages(BLACK, ORDER[i])));
            tile[i][BLACK].empty = false;
            tile[i][BLACK].type = BLACK;
        }
        for (int i = 0; i < ORDER.length; i++) {
            tile[i][1].setIcon(new ImageIcon(Player.getChessPieceImages(BLACK, PAWN)));
            tile[i][1].empty = false;
            tile[i][1].type = BLACK;
        }    
    }
    
    /**
     * Add white pieces and white pawns.
     */
    public void setPlayer1() {
        for (int i = 0; i < ORDER.length; i++) {
            tile[i][7].setIcon(new ImageIcon(Player.getChessPieceImages(WHITE, ORDER[i])));
            tile[i][7].empty = false;
            tile[i][7].type = WHITE;
        }

        for (int i = 0; i < ORDER.length; i++) {
            tile[i][6].setIcon(new ImageIcon(Player.getChessPieceImages(WHITE, PAWN)));
            tile[i][6].empty = false;
            tile[i][6].type = WHITE;
        }  
    }
    
}
