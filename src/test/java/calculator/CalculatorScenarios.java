package calculator;

import static org.assertj.core.api.BDDAssertions.then;

import org.junit.jupiter.api.Test;

final class CalculatorScenarios {

    @Test
    void readyForTraining(){
        var description = "I am ready for training. Environment is configured successfully :)";
        then(description).isNotBlank();
    }
}
