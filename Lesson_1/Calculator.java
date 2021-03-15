public class Calculator {
    public static void main(String[] args) {
        int number1 = 23;
        int number2  = 7;
        double result = 0;
        char operation = '^';

        if(operation == '+') {
            result = number1 + number2;
        } else if(operation == '-') {
            result = number1 - number2;
        } else if(operation == '*') {
            result = number1 * number2;
        } else if(operation == '/') {
            result = 1.0 * number1 / number2;
        } else if(operation == '^') {
            result = number1;
            for(int i = 0; i < number2 - 1; i++) {
                result *= number1;
            }
        } else {
            result = number1 % number2;
        }
        System.out.println(result);
    }
}

