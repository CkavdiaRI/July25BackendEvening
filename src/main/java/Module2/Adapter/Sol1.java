package Module2.Adapter;

interface BankAPI {
    void pay(double amount);
    double getBalance();
}

class HDFCBank implements BankAPI {
    @Override
    public void pay(double amount) {
        System.out.println("Payment of " + amount + " made using HDFC API.");
    }

    @Override
    public double getBalance() {
        return 1000.0; // Example balance
    }
}

class SBIBank implements BankAPI {
    @Override
    public void pay(double amount) {
        System.out.println("Payment of " + amount + " made using SBI API.");
    }

    @Override
    public double getBalance() {
        return 2000.0; // Example balance
    }
}

class PhonePe{
    void pay(BankAPI1 bankAPI, double amount) {
        bankAPI.deposit(amount);
        System.out.println("Payment of " + amount + " made using PhonePe.");
    }
}

public class Sol1 {

    public static void main(String[] args) {
        BankAPI hdfcBank = new HDFCBank();
//        PhonePe phonePeHDFC = new PhonePe(hdfcBank);
//        phonePeHDFC.makePayment(500.0);
//        System.out.println("HDFC Balance: " + phonePeHDFC.checkBalance());
//
//        BankAPI sbiBank = new SBIBank();
//        PhonePe phonePeSBI = new PhonePe(sbiBank);
//        phonePeSBI.makePayment(300.0);
//        System.out.println("SBI Balance: " + phonePeSBI.checkBalance());
    }

}


// Cons :
// What if a new bank does not follow the same API structure?