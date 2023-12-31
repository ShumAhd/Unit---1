package seminars.first.Calculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testCalculateDiscountValidArguments() {
        // Тестирование метода calculateDiscount с допустимыми аргументами
        Assertions.assertThat(Calculator.calculateDiscount(100, 10)).isEqualTo(90.0);
        Assertions.assertThat(Calculator.calculateDiscount(50, 0)).isEqualTo(50.0);
        Assertions.assertThat(Calculator.calculateDiscount(200, 15)).isEqualTo(170.0);
    }

    @Test
    public void testCalculateDiscountInvalidArguments() {
        // Тестирование метода calculateDiscount с недопустимыми аргументами
        // Ожидается выброс исключения ArithmeticException
        Assertions.assertThatThrownBy(() -> Calculator.calculateDiscount(50, -5))
            .isInstanceOf(ArithmeticException.class)
            .hasMessage("Discount percentage cannot be negative");

        Assertions.assertThatThrownBy(() -> Calculator.calculateDiscount(100, 110))
            .isInstanceOf(ArithmeticException.class)
            .hasMessage("Discount percentage cannot exceed 100");
    }
}
