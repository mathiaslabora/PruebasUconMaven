package co.com.sofka.app.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static junit.framework.Assert.assertEquals;

public class BasicCalculatorTest {
    private final BasicCalculator basicCalculator = new BasicCalculator();

    @Test
    @DisplayName("Testing sum: 1+1=2")
    public void sum() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 4L;
        Long expectedValue = 5L;

        // Act
        Long result = basicCalculator.sum(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }
    public void res() {
        // Arrange
        Long number1 = 6L;
        Long number2 = 4L;
        Long expectedValue = 2L;

        // Act
        Long result = basicCalculator.res(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }
    public void div() {
        // Arrange
        Long number1 = 6L;
        Long number2 = 2L;
        Long expectedValue = 3L;

        // Act
        Long result = basicCalculator.div(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }
    public void mul() {
        // Arrange
        Long number1 = 6L;
        Long number2 = 4L;
        Long expectedValue = 24L;

        // Act
        Long result = basicCalculator.mul(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }








  /*  @DisplayName("Testing several sums")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    public void severalSums(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.sum(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }*/


}
