package Module3.TicTacToe.strategies;

import Module3.TicTacToe.models.Board;
import Module3.TicTacToe.models.Move;
import Module3.TicTacToe.models.Player;

public class EasyBotPlayingStrategy implements BotPlayingStrategy{
    @Override
    public Move makeMove(Board board, Player player) {
        for(int i = 0; i < ; i++) {
            for(int j = 0; j < 3; j++) {
                if (getGame().getBoard().getCell(i, j) == null) {
                    return new Move(i, j, getSymbol());
                }
            }
        }
    }
}
