package ${package}.feature.step.definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import $package.feature.states.TestState;

public class Whens {
    private final TestState state;

    public Whens(TestState state) {
        this.state = state;
    }

    @When("a when")
    public void theSystemIsOperational() {

    }
}
