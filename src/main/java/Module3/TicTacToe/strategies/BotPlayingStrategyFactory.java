package Module3.TicTacToe.strategies;

import Module3.TicTacToe.models.BotDifficultLevel;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategy(BotDifficultLevel level) {
        if(level == BotDifficultLevel.EASY) {
            return new EasyBotPlayingStrategy();
        }
        return null;
    }
}
