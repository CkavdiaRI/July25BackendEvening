package Module1.Multithreading.LabSession.BankSimulation;

class BankAccountSol {
    private long  balance = 0;

    public synchronized void deposit(long amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public synchronized void withdraw(long amount) {
        if (balance >= amount && amount > 0) {
            balance -= amount;
        }
    }

    public long  getBalance() {
        return balance;
    }

    public void setBalance(long  balance) {
        this.balance = balance;
    }
}