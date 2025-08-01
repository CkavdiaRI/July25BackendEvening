package Module3.TicTacToe;

import Module3.TicTacToe.models.Game;
import Module3.TicTacToe.models.GameState;
import Module3.TicTacToe.models.Player;
import Module3.TicTacToe.strategies.WinningStrategy;

import java.util.List;

public class GameController {

    public Game startNewGame(int size, List<Player>players, List<WinningStrategy> winningStrategies) {
        return new Game(size, players, winningStrategies);
    }

    public void makeMove(Game game) {
        game.makeMove();
    }

    public Player checkWinner(Game game) {
        return game.getWinner();
    }

    public void displayBoard(Game game) {
        game.displayBoard();
    }

    public GameState getGameState(Game game) {
        return game.getGameState();
    }

    public void undoMove(Game game) {
        game.undoMove();
    }

}


/// Use cases
// Start a new game
// Make a move
// Check a winner
// Display the game board
// Check the state of the game
// Undo a move