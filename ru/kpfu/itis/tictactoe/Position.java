package ru.kpfu.itis.tictactoe;

import java.util.Objects;
/**
 * entity class representing position in game field
 * @auhor Michael Schastlivtsev <rodsher111@gmail.com>
 * @version 1.0
 */

public class Position {
    private int i;
    private int j;
    private static String letters = "abc";// valueOf(a1)
    public Position(int i, int j) {
        this.i = i;
        this.j = j;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return i == position.i &&
                j == position.j;
    }

    @Override
    public int hashCode() {
        return Objects.hash(i, j);
    }

    /**
     * rank getter method
     * @return index of the rank
     */
    public int getRank() {
        return i;
    }

    /**
     * column getter method
     * @return index of the column
     */
    public int getColumn() {
        return j;
    }

    /**
     * converts string to a mark
     * @param string that should be converted
     * @return mark gained mark
     * @throws PositionFormatException thrown if an error occurs during conversion
     */
    public static Position valueOf(String string) throws PositionFormatException{
        try {
            int i = letters.indexOf(string.charAt(0));
            int j = Character.digit(string.charAt(1), 10) - 1;
            if (i < 0 || i > 3 || j < 0 || j > 3){
                System.out.println("Oh, hi, Mark");
                throw new PositionFormatException("Argument string cannot be converted to position");
            }
            return new Position(i, j);

        }
        catch(NumberFormatException | StringIndexOutOfBoundsException ex){
            throw new PositionFormatException("Argument string cannot be converted to position");
        }
    }
    @Override
    public String toString() {
        return String.valueOf(letters.charAt(i)) + String.valueOf(j + 1);
    }
}
