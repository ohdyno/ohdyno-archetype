package ${package}.feature.step.definitions;

import io.cucumber.java.en.Then;
import ${package}.feature.states.TestState;

public class Thens {
    private final TestState state;

    public Thens(TestState state) {
        this.state = state;
    }

    @Then("a then")
    public void aThen() {

    }
}
