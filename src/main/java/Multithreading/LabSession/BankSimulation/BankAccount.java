package Multithreading.LabSession.BankSimulation;

public class BankAccount {
    private Long balance = 0L;

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    // TODO: implement this method
    public void deposit(Long amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // TODO: implement this method
    public void withdraw(Long amount) {
        if (balance >= amount && amount > 0) {
            balance -= amount;
        }
    }
}