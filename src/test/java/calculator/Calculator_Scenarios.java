package calculator;

import static org.assertj.core.api.BDDAssertions.then;

import org.junit.jupiter.api.Test;

final class Calculator_Scenarios {

    @Test
    void Ready_for_training() {

        var description = "I am ready for training. Environment is configured successfully :)";
        then(description).isNotBlank();
    }
}
