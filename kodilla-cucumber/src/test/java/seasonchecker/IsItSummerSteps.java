package seasonchecker;

import io.cucumber.java8.En;

public class IsItSummerSteps implements En {
    private String today;
    private String answer;

    public IsItSummerSteps() {

        Given("today is the last day of December", () -> {
            this.today = "last day of December";
        });

        When("I ask whether it's Summer", () -> {
            SeasonChecker seasonChecker = new SeasonChecker();
            this.answer = seasonChecker.checkIfSummer(this.today);
        });

      Then("I should be told (string)", (String string) -> {
              // Write code here that turns the phrase above into concrete actions
              throw new io.cucumber.java8.PendingException();
      });
    }
}
