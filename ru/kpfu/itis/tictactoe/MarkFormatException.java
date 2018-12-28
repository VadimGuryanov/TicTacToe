package ru.kpfu.itis.tictactoe;

/**
 * exception thrown if and error occurs during mark converting
 */
public class MarkFormatException extends IllegalArgumentException {
    public MarkFormatException(String message){
        super(message);
    }
}
