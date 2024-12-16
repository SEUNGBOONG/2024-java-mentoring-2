package domain;

import com.calculator.domain.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {


    @Test
    void 더하기_메서드를_구현한다() {

        // given
        Calculator calculator = new Calculator();

        // when
        int result = calculator.plusResult(3,5);
        int expect = 8;
        int notExact = 7;

        // then

        Assertions.assertNotEquals(result,notExact);
        Assertions.assertEquals(result,expect);

    }

}
