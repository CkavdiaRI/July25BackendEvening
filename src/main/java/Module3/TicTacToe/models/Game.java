package Module3.TicTacToe.models;

import Module3.TicTacToe.strategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private GameState gameState;
    private List<Move> moves;
    private Player winner;
    private int nextPlayerIndex;
    private List<WinningStrategy> winningStrategies;

    public Game(int size, List<Player> players, List<WinningStrategy> winningStrategies) {
        this.board = new Board(size);
        setPlayers(players);
        this.gameState = Module3.TicTacToe.models.GameState.IN_PROGRESS;
        this.moves = new ArrayList<>();
        this.winner = null;
        this.nextPlayerIndex = 0;
        this.winningStrategies = winningStrategies;
    }

    public void setPlayer(List<Player> players) {
        this.players = players;
        for(Player player : players) {
            player.setGame(this);
        }
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState state) {
        this.gameState = state;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }

    public void makeMove(){
        // Prompt the current player to make a move
        Player currentPlayer = players.get(nextPlayerIndex);
        System.out.println(currentPlayer.getName() + ", it's your turn. Please be ready: ");

        Move move = currentPlayer.makeMove();

        // Validate the move

        // Update the board with the move

        // Check if the move results in a win or draw

    }

    public void displayBoard() {
        board.displayBoard();
    }

    public Player checkWinner(){return null;}

    public void undoMove(){}
}
