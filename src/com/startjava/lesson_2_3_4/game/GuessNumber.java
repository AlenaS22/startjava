package com.startjava.lesson_2_3_4.game;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class GuessNumber {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    private int secretNumber;
    private final Player player1;
    private final Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        System.out.println("Игра начинается... У каждого игрока по 10 попыток.");
        secretNumber = random.nextInt(100) + 1;
        // подготовка массивов, если игра запущена повторно
        prepareNumbers();
        int i;
        for (i = 0; i < 10; i++) {
            inputNumber(player1, i);
            if (compareNumbers(player1, i)) {
                break;
            }
            inputNumber(player2, i);
            if (compareNumbers(player2, i)) {
                break;
            }
            if (i == 9) {
                break;
            }
        }
        // печатаем только ненулевые значения
        // вместо countNotZero использовать i из for
        int j = player2.getLastNumber(i) == 0 ? i : i + 1;
        printNumbers(player1, i + 1);
        printNumbers(player2, j);
    }

    private void prepareNumbers() {
        // при повторном запуске в массиве Игрока 1 есть как минимум одно число
        if (player1.getLastNumber(0) != 0) {
            player1.clearNumbers();
            player2.clearNumbers();
        }
    }

    private void inputNumber(Player player, int index) {
        System.out.println('\n' + player.getName() + ", введите число от 1 до 100");
        player.insertNumber(scanner.nextInt(), index);
    }

    private boolean compareNumbers(Player player, int index) {
        if (player.getLastNumber(index) == secretNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + secretNumber + " с " + (index + 1) + " попытки.");
            return true;
        }
        // в методе для проверки чисел для веток с проверкой > и < использовать тернарный оператор
        String sign = player.getLastNumber(index) < secretNumber ? " меньше " : " больше ";
        System.out.println("Введенное число " + player.getLastNumber(index) + sign + "того, что загадал компьютер.");
        if (index == 9) {
            System.out.println("У игрока " + player.getName() + " закончились попытки");
        }
        return false;
    }

    // метод для вывода чисел из массива
    private void printNumbers(Player player, int length) {
        int[] copyNumbers = Arrays.copyOf(player.getNumbers(), length);
        for (int number: copyNumbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}