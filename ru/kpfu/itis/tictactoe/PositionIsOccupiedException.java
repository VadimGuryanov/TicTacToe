package ru.kpfu.itis.tictactoe;

public class PositionIsOccupiedException extends IllegalArgumentException{
    public PositionIsOccupiedException(String message) {
        super(message);
    }
}
