package Module3.TicTacToe;

import Module3.TicTacToe.models.*;
import Module3.TicTacToe.strategies.RowWinningStrategy;
import Module3.TicTacToe.strategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        GameController gameController = new GameController();

        // Start the game
        int size = 3; // Example size for the game board
        List<Player> players = new ArrayList<>();
        players.add(new Human("Player 1", new Symbol('X'), 1));
        players.add(new Bot("Player 2", new Symbol('O'), BotDifficultLevel.EASY));
        List<WinningStrategy> winningStrategies = new ArrayList<>();
        winningStrategies.add(new RowWinningStrategy());

        Game game = gameController.startNewGame(size, players, winningStrategies);
        //gameController.displayBoard(game);
        while(gameController.getGameState(game).equals(GameState.IN_PROGRESS)) {
            gameController.displayBoard(game);
            gameController.makeMove(game);
        }

        // Display the results
        if(gameController.getGameState(game).equals(GameState.SUCCESS)) {
            System.out.println("Game Over! The winner is: " + gameController.checkWinner(game).getName());
        } else if (gameController.getGameState(game).equals(GameState.DRAW)) {
            System.out.println("Game Over! It's a draw.");
        }
    }
}
