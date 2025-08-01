package Module3.TicTacToe.strategies;

import Module3.TicTacToe.models.Board;
import Module3.TicTacToe.models.Move;
import Module3.TicTacToe.models.Player;

public interface BotPlayingStrategy {
    public Move makeMove(Board board, Player player);
}
