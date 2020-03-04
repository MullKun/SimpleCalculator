import java.math.BigInteger;
import java.util.Collections;
import java.util.List;


public class SimpleCalculator {

    private static int HALF = 2;

    public static void evaluate(List<String> splittedExpression){
        if(isValidExpression(splittedExpression)) {
            try {
                BigInteger result = new BigInteger(splittedExpression.get(0));
                int i = 1;
                while (i < splittedExpression.size()) {
                    result = operate(result, splittedExpression.get(i), new BigInteger(splittedExpression.get(i + 1)));
                    i = i + 2;
                }
                System.out.println("Result: " + result.toString());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("Invalid exprssion");
        }
    }

    private static boolean isValidExpression(List<String> elements) {
        return elements.size()%2==1 && Collections.frequency(elements, "+")+Collections.frequency(elements, "-") == (elements.size()-1)/HALF;
    }

    private static BigInteger operate(BigInteger number, String operator, BigInteger value) throws Exception {
        switch(operator) {
            case "+":
                return number.add(value);
            case "-":
                return number.subtract(value);
            default:
                throw new Exception("Invalid operator");
        }
    }

}