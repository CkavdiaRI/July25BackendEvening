package Module3.TicTacToe.strategies;

import Module3.TicTacToe.models.Board;
import Module3.TicTacToe.models.Move;
import Module3.TicTacToe.models.Symbol;

import java.util.HashMap;

public class RowWinningStrategy implements WinningStrategy{
    private HashMap<Integer, HashMap<Character, Integer>> rowCounts = new HashMap<>();
    @Override
    public boolean checkWinner(Board board, Move move){
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        // Check if the row exists in the map, if not, initialize it
        if(!rowCounts.containsKey(row)) {
            rowCounts.put(row, new HashMap<>());
        }

        // Update the count for the player's symbol in the row
        HashMap<Character, Integer> symCountMap = rowCounts.get(row);
        Symbol symbol = move.getPlayer().getSymbol();
        Character symChar = symbol.getSymbol();
        if(!symCountMap.containsKey(symChar)) {
            symCountMap.put(symChar, 0);
        }
        symCountMap.put(symChar, symCountMap.get(symChar) + 1);

        if(symCountMap.get(symChar) == board.getSize()) {
            return true;
        }

        return false;
    }
}
