package ru.kpfu.itis.tictactoe;

import java.util.Scanner;

public class ConsoleUserInteractor implements UserInteractor {
    /**
     * purpose: Interacts with user through the terminal
     * @author Vadim Guryanov </gvadimmonstors@mail.ru>
     * @version 1.0
     */
    Scanner sc;
    /** constructor method */
    public ConsoleUserInteractor(){
        this.sc = new Scanner(System.in);
    }

    /**
     * read command from terminal
     * @return entered command: type - String
     */
    @Override
    public String readCommand() {
        String command = sc.nextLine();
        return command;
    }

    /**
     * print something to console
     * @param string - printed message of type String
     */
    @Override
    public void print(String string) {
        System.out.println(string);
    }
}
