package ru.kpfu.itis.tictactoe;

import ru.kpfu.itis.teamgbe.gameengine.GameWindow;
import ru.kpfu.itis.teamgbe.gameengine.Gamefield;

import java.awt.*;
/**
 * graphically displaying subprogram
 * @auhor Michael Schastlivtsev <rodsher111@gmail.com>
 * @version 1.0
 */
public class GraphicalRepresentation implements Representation {
    /** fields used for graphics*/
    Gamefield gamefield;
    GameWindow window;

    /**
     * constructor method
     * @param table - displayed table
     */
    public GraphicalRepresentation(Table table) {
        this.gamefield = new Gamefield(3, 3);
        this.window = new GameWindow("TicTacToe", 800, 600, 30, gamefield);
        this.window.setFont(new Font(window.getFont().getName(), Font.PLAIN, 200));
        this.window.setCoordinatesEnabled(false);
    }

    /**
     * displaying method
     * @param table - displayed table
     */
    @Override
    public void display(Table table) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (table.getFromPosition(new Position(i, j)) == null) {
                    continue;
                }
                gamefield.gameField[i][j].setText((table.getFromPosition(new Position(i, j)).toString()));
            }
        }
    }
}
