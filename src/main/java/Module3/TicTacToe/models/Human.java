package Module3.TicTacToe.models;

public class Human extends Player{
    private int level;
    java.util.Scanner scanner = new java.util.Scanner(System.in);

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }


    public Human(String name, Symbol symbol, int level) {
        super(name, symbol, PlayerType.HUMAN);
        this.level = level;
    }

    @Override
    public Move makeMove() {
        System.out.println("Please enter the row: ");
        int row = scanner.nextInt();
        System.out.println("Please enter the column: ");
        int column = scanner.nextInt();

        return new Move(new Cell(row, column), this);
    }
}
