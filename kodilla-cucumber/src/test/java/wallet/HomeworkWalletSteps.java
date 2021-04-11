package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;
import org.mockito.Mockito;

public class HomeworkWalletSteps implements En {
    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();
    private Cashier cashier = new Cashier(cashSlot);
    private Display display = Mockito.mock(Display.class);

    public HomeworkWalletSteps() {

        // User tries to take out more money than their balance
        Given("there is $100 in my wallet", () -> {
            wallet.deposit(100);
        });

        When("I withdraw $200", () -> {
            cashier.withdraw(wallet, 200, display);
        });

        Then("nothing should be dispensed", () -> {
            Assert.assertEquals(0, cashSlot.getContents());
        });

        Then("I should be told that I don't have enough money in my wallet", () -> {
            Mockito.verify(display, Mockito.times(1)).displayMessage("You don't have enough money in your wallet");
        });


        // User checks the balance of their wallet
        When("I check the balance of my wallet", () -> {
            wallet.checkBalance(display);
        });

        Then("I should see that the balance is $100", () -> {
            Mockito.verify(display, Mockito.times(1)).displayMessage("Your balance: $100");
        });


        // User sees the balance after depositing
        Given("there is $200 in my wallet", () -> {
            wallet.deposit(200);
        });

        When("I want to deposit $50 in my wallet", () -> {
            wallet.deposit(50);
        });

        Then("$250 should be in my wallet", () -> {
            wallet.checkBalance(display);
            Assert.assertEquals(250, wallet.getBalance());
        });

        Then("I should see the balance is $250", () -> {
            Mockito.verify(display, Mockito.times(1)).displayMessage("Your balance: $250");
        });


        // User sees the balance after withdrawal
        Given("there is $500 in my wallet", () -> {
            wallet.deposit(500);
        });

        When("I request $100", () -> {
            cashier.withdraw(wallet, 100, display);
        });

        Then("$100 should be dispensed", () -> {
            Assert.assertEquals(100, cashSlot.getContents());
        });

        Then("I should see that the balance is $400", () -> {
            Mockito.verify(display, Mockito.times(1)).displayMessage("Your balance: $400");
        });
    }
}