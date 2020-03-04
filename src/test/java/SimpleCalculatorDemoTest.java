import java.util.Arrays;

import org.junit.Test;

public class SimpleCalculatorDemoTest {

    @Test
    public void test() {
        String expression = "1 + 2 + 3 + 4 - 3 - 5 =";
        SimpleCalculator.evaluate(Arrays.asList(expression.split(" ")));
    }
}
