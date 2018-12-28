package ru.kpfu.itis.tictactoe;

/**
 * entity class representing the game field (game table)
 *@author Iskander Musin </musin.iskn@mail.ru>
 * @version 1.0
 */
public class Table {
    /** contains mark, represents a table */
    protected Mark [][] table;
    /** constructor method */
    public Table(){
        this.table = new Mark[3][3];
    }

    /**
     * puts mark on a specific position
     * @param pos - position
     * @param mark - mark that should be put
     */
    public void putOnPosition(Position pos, Mark mark) {
        this.table[pos.getRank()][pos.getColumn()] = mark;
    }

    /**
     * gets marks from pos
     * @param pos - position
     * @return mark on a position pos
     */
    public Mark getFromPosition(Position pos){
        return this.table[pos.getRank()][pos.getColumn()];
    }

    /**
     *
     * @param pos - position
     * @return whether position is empty
     */
    public boolean positionIsEmpty(Position pos){
        if (table[pos.getRank()][pos.getColumn()] == null) return true;
        return false;
    }
}
