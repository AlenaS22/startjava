// TODO
// Модифицируйте программу Калькулятор:
// используйте следующий формат ввода (пример): Введите математическое выражение: 2 ^ 10
// введенное выражение храните в массиве. В этом поможет метод String.split()
// для преобразования чисел выражения из String в int используйте метод Integer.parseInt()
// замените методами класса Math, какие только сможете найти, ваши реализации вычислений
// метод calculate() должен возвращать результат вычисления. Выводите его в CalculatorTest

package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String answer;

        do {
            System.out.print("Введите математическое выражение в формате [число1][пробел][знак][пробел][число2]: ");
            String[] expression = scanner.nextLine().split(" ");
            calculator.setNumber1(Integer.parseInt(expression[0]));
            calculator.setOperation(expression[1].charAt(0));
            calculator.setNumber2(Integer.parseInt(expression[2]));
            System.out.println("Результат: " + calculator.calculate());
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]: ");
                answer = scanner.nextLine();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while(answer.equals("yes"));
    }
}