package numberChecker;

import io.cucumber.java8.En;
import org.junit.Assert;

public class CheckTheNumberSteps implements En {
    private int number;
    private String response;

    public CheckTheNumberSteps() {
        Given("My number is 9", () -> {
            this.number = 9;
                });

        Given("My number is 12", () -> {
            this.number = 12;
        });

        Given("My number is 18", () -> {
            this.number = 18;
        });

        Given("My number is 21", () -> {
            this.number = 21;
        });

        Given("My number is 24", () -> {
            this.number = 24;
        });

        Given("My number is 5", () -> {
            this.number = 5;
        });

        Given("My number is 10", () -> {
            this.number = 10;
        });

        Given("My number is 20", () -> {
            this.number = 20;
        });

        Given("My number is 25", () -> {
            this.number = 25;
        });

        Given("My number is 35", () -> {
            this.number = 35;
        });

        Given("My number is 15", () -> {
            this.number = 15;
        });

        Given("My number is 30", () -> {
            this.number = 30;
        });

        Given("My number is 45", () -> {
            this.number = 45;
        });

        Given("My number is 60", () -> {
            this.number = 60;
        });

        Given("My number is 75", () -> {
            this.number = 75;
        });

        Given("My number is 1", () -> {
            this.number = 1;
        });

        Given("My number is 2", () -> {
            this.number = 2;
        });

        Given("My number is 4", () -> {
            this.number = 4;
        });

        Given("My number is 19", () -> {
            this.number = 19;
        });

        Given("My number is 32", () -> {
            this.number = 32;
        });

        When("I ask what number it is", () -> {
            NumberChecker checker = new NumberChecker();
            this.response = checker.checkNumber(this.number);
        });

        Then("I should get {string}", (String string) -> {
            Assert.assertEquals(string, this.response);
        });
    }
}
