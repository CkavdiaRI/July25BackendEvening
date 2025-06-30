package Module1.Multithreading.LabSession.BankSimulation;

class BankAccountSol1 {
    private long  balance = 0;

    public synchronized void deposit(long amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + " | Balance: " + balance);
            notifyAll(); // Wake up waiting withdrawers
        }
    }

    public synchronized void withdraw(long amount) {
        while (balance < amount) {
            try {
                System.out.println("Waiting to withdraw: " + amount + " | Current Balance: " + balance);
                wait(); // Wait until enough balance is available
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Withdrawal thread interrupted.");
                return;
            }
        }
        balance -= amount;
        System.out.println("Withdrew: " + amount + " | Balance: " + balance);
    }

    public long  getBalance() {
        return balance;
    }

    public void setBalance(long  balance) {
        this.balance = balance;
    }
}