package wallet;

public class Cashier {
    private CashSlot cashSlot;

    public Cashier(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public void withdraw(Wallet wallet, int amount, Display display) {
        if (wallet.getBalance() > amount) {
            cashSlot.dispense(amount);
            wallet.debit(amount);
            wallet.checkBalance(display);
        }
        else {
            display.displayMessage(overBalanceMessage());
        }
    }

    private String overBalanceMessage() {
        String message = "You don't have enough money in your wallet";
        return message;
    }
}