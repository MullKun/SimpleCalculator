import java.util.Arrays;
import java.util.List;


public class SimpleCalculatorDemo {

    public static void main(String[] args) {
        List<String> elements = Arrays.asList(args[0].split(" "));
        SimpleCalculator.evaluate(elements);
    }

}
