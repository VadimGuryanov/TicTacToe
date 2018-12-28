package ru.kpfu.itis.tictactoe;
/**
 *contains game rules
 @author Iskander Musin <musin.iskn>
 @version 1.4

 */
public class GameLogic {
    /** TicTacToe game field */
    private Table table;
    /** Constructor method */
    public GameLogic(Table table) {
        this.table = table;
    }
    /**
     * defines either the game is over
     * @return boolean game state
     */

    public boolean gameIsOver(){
        for (int i = 0; i < 3; i++){
            if (table.getFromPosition(new Position(i,0)) != null & table.getFromPosition(new Position(i,1)) != null & table.getFromPosition(new Position(i, 2)) != null) {
                if ((this.table.getFromPosition(new Position(i, 0))).equals(table.getFromPosition(new Position(i,1))) & (this.table.getFromPosition(new Position(i, 2))).equals(table.getFromPosition(new Position(i,2)))) {
                    return true;
                }
            }
        }
        for (int i = 0; i < 3; i++){
            if (table.getFromPosition(new Position(0,i)) != null & table.getFromPosition(new Position(1,i)) != null & table.getFromPosition(new Position(2,i)) != null) {
                if ((this.table.getFromPosition(new Position(0,i))).equals(table.getFromPosition(new Position(1,i))) & (this.table.getFromPosition(new Position(2,i))).equals(table.getFromPosition(new Position(2,i)))) {
                    return true;
                }
            }
        }
        if(table.getFromPosition(new Position(0,0)) != null & table.getFromPosition(new Position(1,1)) != null & table.getFromPosition(new Position(2,2)) != null) {
            if (table.getFromPosition(new Position(0,0)).equals(table.getFromPosition(new Position(1,1))) & table.getFromPosition(new Position(0,0)).equals(table.getFromPosition(new Position(2,2)))) {
                return true;
            }
        }
        if (table.getFromPosition(new Position(0,2)) != null & table.getFromPosition(new Position(1,1)) != null & table.getFromPosition(new Position(2,0)) != null) {
            if (table.getFromPosition(new Position(0,2)).equals(table.getFromPosition(new Position(1,1))) & table.getFromPosition(new Position(0,2)).equals(table.getFromPosition(new Position(2,0)))) {
                return true;
            }
        }
        boolean full = true;
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                if (table.getFromPosition(new Position(i, j)) == null){
                    full = false;
                }
            }
        }
        if (full){
            return true;
        }
        return false;
    }
    /**
     * makes a move - puts mark on a field
     * @param pos - position defining where to put a mark, mark - used mark x or o
     * @throws PositionIsOccupiedException if chosen position has a mark already
     */
    public void makeMove(Position pos, Mark mark)throws PositionIsOccupiedException{
        if (this.table.positionIsEmpty(pos)) {
            this.table.putOnPosition(pos, mark);
        }
        else{
            throw new PositionIsOccupiedException("Position is not empty.");
        }
    }
}
