package ru.kpfu.itis.tictactoe;

import ru.kpfu.itis.teamgbe.gameengine.Gamefield;

/**
 * main program of the game
 * @author Iskander Musin </musin.iskn@mail.ru>
 * @version 1.7
 */
public class Game {


    public static void main(String [] args){
        ConsoleUserInteractor console = new ConsoleUserInteractor();
        Table table = new Table();
        GraphicalRepresentation graphics = new GraphicalRepresentation(table);
        Gamefield gamefield = new Gamefield(3, 3);
        //GameWindow window = new GameWindow("TicTacToe", 800, 600, 30, gamefield);
        GameLogic logic = new GameLogic(table);
        String command = "";
        String message;
        boolean mark = false;
        String pos;
        console.print("Welcome to the game!");
        while(!command.equals("exit") & !logic.gameIsOver()) {
            mark = !mark;
            if (mark){
                message = "Now x's turn.";
            }
            else{
                message = "Now o's turn.";
            }
            console.print(message);
            console.print("Enter the position (first enter column letter, then rank number) to put a mark or type \"exit\" to exit.");
            command = console.readCommand();
            switch (command) {
                case ("exit"):
                    continue;
                default:
                    while (true){
                        try {
                            logic.makeMove(Position.valueOf(command), new Mark(mark));
                            break;
                        }
                        catch(PositionFormatException | MarkFormatException | PositionIsOccupiedException ex) {
                            console.print("Invalid input. Try again." + ex.getMessage());
                            command = console.readCommand();
                        }
                    }

            }
            //console.print(table.getFromPosition(new ru.kpfu.itis.tictactoe.Position(0,0)).toString());
            graphics.display(table);
        }
        if (!command.equals("exit") & mark){
            console.print("x won.");
        }
        else if (!command.equals("exit") & !mark) {
            console.print("o won.");
        }
        console.print("The game is ended. Goodbye!");

    }


}
