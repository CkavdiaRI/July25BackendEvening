package Module3.TicTacToe.strategies;

import Module3.TicTacToe.models.Board;
import Module3.TicTacToe.models.Move;

import java.util.HashMap;

public class RowWinningStrategy implements WinningStrategy{
    private HashMap<Integer, HashMap<Character, Integer>> rowCounts = new HashMap<>();
    @Override
    public boolean checkWinner(Board board, Move move){



        return false;
    }
}
