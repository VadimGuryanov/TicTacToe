package ru.kpfu.itis.tictactoe;

/**
 * exception thrown if an error occurs during position converting
 */
public class PositionFormatException extends IllegalArgumentException{
    public PositionFormatException(String message){
        super(message);
    }
}
