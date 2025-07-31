package Module3.TicTacToe.strategies;

import Module3.TicTacToe.models.Board;
import Module3.TicTacToe.models.Move;

public interface WinningStrategy {
    public boolean checkWinner(Board board, Move move);
}
