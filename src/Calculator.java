import java.text.DecimalFormat;

public class Calculator {
    public Calculator() {
    }
    String pattern = "####,####.##";
    DecimalFormat df = new DecimalFormat(pattern);

    public String calcSolve(String expression) {
        if (expression.contains("*")) {
            int index = expression.indexOf("*");

            String num1 = expression.substring(0, index);
            String num2 = expression.substring(index + 1);
            double number1 = makeNum(num1);
            double number2 = makeNum(num2);

            return df.format(number1 * number2);
        } else if (expression.contains("/")) {
            int index = expression.indexOf("/");

            String num1 = expression.substring(0, index);
            String num2 = expression.substring(index + 1);
            double number1 = makeNum(num1);
            double number2 = makeNum(num2);

            return df.format(number1/number2);
        } else if (expression.contains("+")) {
            int index = expression.indexOf("+");

            String num1 = expression.substring(0, index);
            String num2 = expression.substring(index + 1);
            double number1 = makeNum(num1);
            double number2 = makeNum(num2);

            return df.format(number1 + number2);
        } else if (expression.contains("-")) {
            if (expression.indexOf("-") == 0) {
                String newString = expression.replaceFirst("-", "");
                int index = newString.indexOf("-");
                String num1 = newString.substring(0, index);
                String num2 = newString.substring(index + 1);
                double number1 = makeNum(num1) * -1;
                double number2 = makeNum(num2);
                return df.format(number1 - number2);
            } else {
                int index = expression.indexOf("-");
                String num1 = expression.substring(0, index);
                String num2 = expression.substring(index + 1);
                double number1 = makeNum(num1);
                double number2 = makeNum(num2);
                return df.format(number1 - number2);
            }
        } else if (expression.contains("%")) {
            int index = expression.indexOf("%");

            String num1 = expression.substring(0, index);
            String num2 = expression.substring(index + 1);
            double number1 = makeNum(num1);
            double number2 = makeNum(num2);

            return df.format(number1 % number2);
        } else {
            int index = expression.indexOf("^");

            String num1 = expression.substring(0, index);
            String num2 = expression.substring(index + 1);
            double number1 = makeNum(num1);
            double number2 = makeNum(num2);

            return df.format(Math.pow(number1, number2));
        }
    }


    public double makeNum(String values) {
        return Double.parseDouble(values);
    }
}

