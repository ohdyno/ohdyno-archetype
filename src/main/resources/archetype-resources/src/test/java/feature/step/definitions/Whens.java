package ${package}.feature.step.definitions;

import io.cucumber.java.en.When;
import ${package}.feature.states.TestState;

public class Whens {
    private final TestState state;

    public Whens(TestState state) {
        this.state = state;
    }

    @When("a when")
    public void aWhen() {

    }
}
