package Module3.TicTacToe.models;

import Module3.TicTacToe.strategies.BotPlayingStrategy;
import Module3.TicTacToe.strategies.BotPlayingStrategyFactory;

public class Bot extends Player{
    private BotDifficultLevel difficultyLevel;

    public Bot(String name, Symbol symbol, BotDifficultLevel difficultyLevel) {
        super(name, symbol, PlayerType.BOT);
        this.difficultyLevel = difficultyLevel;
    }

    @Override
    public Move makeMove() {
        BotPlayingStrategy strategy = BotPlayingStrategyFactory.getBotPlayingStrategy(difficultyLevel);
        return strategy.makeMove(getGame().getBoard(), this);
    }

//    public BotDifficultLevel getDifficultyLevel() {
//        return difficultyLevel;
//    }
//
//    public void setDifficultyLevel(int difficultyLevel) {
//        this.difficultyLevel = difficultyLevel;
//    }
}
