package ru.kpfu.itis.tictactoe;

/**
 * @author Vadim Guryanov </gvadimmonstors@mail.ru>
 * interface for the user interacting subprograms
 */
public interface UserInteractor {
    String readCommand();
    void print(String string);
}
