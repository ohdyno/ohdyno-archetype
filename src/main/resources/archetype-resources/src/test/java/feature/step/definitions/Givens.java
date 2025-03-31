package ${package}.feature.step.definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import $package.feature.states.TestState;

public class Givens {
    private final TestState state;

    public Givens(TestState state) {
        this.state = state;
    }

    @Given("the system is operational")
    public void theSystemIsOperational() {

    }

    @Given("a given")
    public void theSystemIsOperational() {

    }
}
