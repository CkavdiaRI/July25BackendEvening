package Module2.Adapter;

interface BankAPI1 {
    void deposit(double amount);
    double getBalance();
}

class HDFCBank1 implements BankAPI1 {
    @Override
    public void deposit(double amount) {
        System.out.println("Deposited " + amount + " in HDFC Bank.");
    }

    @Override
    public double getBalance() {
        return 1500.0; // Example balance
    }
}

class SBIBank1 implements BankAPI1 {
    @Override
    public void deposit(double amount) {
        System.out.println("Deposited " + amount + " in SBI Bank.");
    }

    @Override
    public double getBalance() {
        return 2500.0; // Example balance
    }
}

class PhonePe1 {

    void pay(Object bankAPI, double amount){
        if (bankAPI instanceof ICICBank1) {
            ((ICICBank1) bankAPI).makeDeposit(amount);
            System.out.println("Payment of " + amount + " made using PhonePe with ICICI Bank.");
        } else if (bankAPI instanceof BankAPI) {
            ((HDFCBank1) bankAPI).deposit(amount);
            System.out.println("Payment of " + amount + " made using PhonePe with HDFC Bank.");
        } else {
            System.out.println("Unsupported bank API.");
        }
    }
}

class ICICBank1{
    public void makeDeposit(double amount){}
    public void checkBalance() {}
}

public class Sol2 {
    public static void main(String[] args) {
        BankAPI1 hdfcBank = new HDFCBank1();
        PhonePe1 phonePeHDFC = new PhonePe1();
        phonePeHDFC.pay(hdfcBank, 500.0);
        System.out.println("HDFC Balance: " + hdfcBank.getBalance());

        BankAPI1 sbiBank = new SBIBank1();
        PhonePe1 phonePeSBI = new PhonePe1();
        phonePeSBI.pay(sbiBank, 300.0);
        System.out.println("SBI Balance: " + sbiBank.getBalance());

        ICICBank1 icicBank = new ICICBank1();
        phonePeHDFC.pay(icicBank, 700.0);
    }
}

// Cons :
// Voilating OCP
// Harder to maintain and extend
// More if-else statements needs to be added for each new bank API

