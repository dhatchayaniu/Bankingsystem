package bankingsystem;
interface BankingService {
    void deposit(double amount);
    void withdraw(double amount);
    void logTransaction(String type, double amount);
}
class Account implements BankingService {
    private int balance = 0;
    public void deposit(double amount) {
        if (amount <= 0 || amount != (int) amount) {
            System.out.println("Invalid");
        } else {
            balance += (int) amount;
            System.out.println("Balance = ₹" + balance);
        }
    }
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds");
        } else if (amount <= 0 || amount != (int) amount) {
            System.out.println("Invalid");
        } else {
            balance -= (int) amount;
            System.out.println("Balance = ₹" + balance);
        }
    }
    public void logTransaction(String type, double amount) {
        System.out.println("Transaction recorded");
    }
}
public class BankingSystem {
    public static void main(String[] args) {
        BankingService account = new Account();
        account.deposit(1000); 
        account.withdraw(500);
        account.withdraw(1500); 
        account.deposit(-200); 
        account.logTransaction("Deposit", 1000); 
        System.out.println("Dhatchayani U"); 
        System.out.println("2117240070066");
    }
}
