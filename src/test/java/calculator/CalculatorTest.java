package calculator;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class CalculatorTest {

    @ParameterizedTest
    @CsvSource(value = {"3 + 4:7", "2 + 3:5", "1 + 2 + 3:6"}, delimiter = ':')
    @DisplayName("입력받은 문자열의 합을 구한다.")
    void plus(String text, int expected) {
        //given
        Calculator calculator = new Calculator();

        //when & then
        assertThat(calculator.calculate(text)).isEqualTo(expected);

    }
}
