package wallet;

public class Wallet {
    private int balance = 0;


    public Wallet() {
    }

    public void deposit(int money) {
        this.balance += money;
    }

    public void checkBalance(Display display) {
        display.displayMessage(balanceMessage());
    }

    public int getBalance() {
        return balance;
    }

    private String balanceMessage() {
        String message = "Your balance: $" + this.balance;
        return message;
    }

    public void debit(int money) {
        this.balance -= money;
    }
}