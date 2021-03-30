import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String answer;

        do {
            System.out.println("Введите первое число: ");
            calculator.setNumber1(scanner.nextInt());
            System.out.println("Введите знак математической операции: ");
            calculator.setOperation(scanner.next().charAt(0));
            System.out.println("Введите второе число: ");
            calculator.setNumber2(scanner.nextInt());
            //дочитывает строку до конца после метода nextInt(), для правильной работы answer = scanner.nextLine();
            scanner.nextLine();
            calculator.calculation();
            System.out.println("Результат: " + calculator.getResult());
            System.out.println("Хотите продолжить вычисления? [yes/no]: ");
            answer = scanner.nextLine();
            while (!answer.equals("yes") && !answer.equals("no")) {
                System.out.println("Хотите продолжить вычисления? [yes/no]: ");
                answer = scanner.nextLine();
            }
        } while(answer.equals("yes"));
    }
}