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
        this.gameState = GameState.IN_PROGRESS;
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
        for(Player player : players) {
            player.setGame(this); // Set the game reference for each player
        }
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

    boolean validate(Move move) {
        // Check if the move is valid
        // For example, check if the cell is empty and within bounds
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        if (row < 0 || row >= board.getSize() || col < 0 || col >= board.getSize()) {
            return false; // Out of bounds
        }

        Cell cell = board.getBoard().get(row).get(col);
        return cell.getCellState().equals(CellState.EMPTY); // Check if the cell is empty
    }

    void updateGameAfterValidMove(Move move){
        // Update the board with the move
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        // Updated the cell
        Cell cellToUpdate = board.getBoard().get(row).get(col);
        cellToUpdate.setCellState(CellState.FILLED);
        cellToUpdate.setPlayer(move.getPlayer());
        cellToUpdate.setSymbol(move.getPlayer().getSymbol());

        // Update the moves list
        move.setCell(cellToUpdate);
        moves.add(move);

        nextPlayerIndex++;
        nextPlayerIndex %= players.size(); // Ensure the index wraps around
    }

    public boolean checkWinner(Move move){
        for(WinningStrategy strategy : winningStrategies) {
            if(strategy.checkWinner(board, move)) {
                return true; // A winning strategy has been satisfied
            }
        }
        return false; // No winning strategy satisfied
    }

    public boolean checkDraw(){
        return moves.size() == board.getSize() * board.getSize();
    }

    public void makeMove(){
        // Prompt the current player to make a move
        Player currentPlayer = players.get(nextPlayerIndex);
        System.out.println(currentPlayer.getName() + ", it's your turn. Please be ready: ");

        Move move = currentPlayer.makeMove();

        // Validate the move
        validate(move);

        // Update the board with the move
        updateGameAfterValidMove(move);

        // Check if the move results in a win or draw
        if(checkWinner(move)){
            gameState = GameState.SUCCESS;
            winner = move.getPlayer();
        } else if (checkDraw()) {
            gameState = GameState.DRAW;
        }

    }

    public void displayBoard() {
        board.displayBoard();
    }


    public void undoMove(){}
}
