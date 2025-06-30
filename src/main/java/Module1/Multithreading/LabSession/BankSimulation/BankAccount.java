package Module1.Multithreading.LabSession.BankSimulation;

public class BankAccount {
    private long balance = 0L;

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    // TODO: implement this method
    public void deposit(long amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // TODO: implement this method
    public void withdraw(long amount) {
        if (balance >= amount && amount > 0) {
            balance -= amount;
        }
    }
}