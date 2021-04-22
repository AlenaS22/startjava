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
        // проверяем, если игра запущена повторно (в массиве Игрока 1 есть как минимум одно ненулевое значение)
        if(player1.selectNumber(0) != 0) {
            Arrays.fill(player1.getNumbers(), 0, countNotZero(player1), 0);
            Arrays.fill(player2.getNumbers(), 0, countNotZero(player2), 0);
        }
        for (int i = 0; i < 10; i++) {
            inputNumber(player1, i);
            if (compareNumbers(player1, i)) {
                break;
            }
            inputNumber(player2, i);
            if (compareNumbers(player2, i)) {
                break;
            }
        }
        // печатаем только ненулевые значения
        printNumbers(player1, countNotZero(player1));
        printNumbers(player2, countNotZero(player2));
    }

    private void inputNumber(Player player, int index) {
        System.out.println('\n' + player.getName() + ", введите число от 1 до 100");
        player.insertNumber(scanner.nextInt(), index);
    }

    private boolean compareNumbers(Player player, int index) {
        if(player.selectNumber(index) == secretNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + secretNumber + " с " + (index + 1) + " попытки.");
            return true;
        }
        if(player.selectNumber(index) < secretNumber) {
            System.out.println("Введенное число " + player.selectNumber(index) + " меньше того, что загадал компьютер.");
        } else {
            System.out.println("Введенное число " + player.selectNumber(index) + " больше того, что загадал компьютер.");
        }
        if(index == 9) {
            System.out.println("У игрока " + player.getName() + " закончились попытки");
        }
        return false;
    }

    // метод для подсчета ненулевых чисел в массиве
    private int countNotZero(Player player) {
        int i = 0;
        while(i < 10) {
            if (player.selectNumber(i) == 0) {
                break;
            }
            i++;
        }
    return i;
    }

    // метод для вывода чисел из массива
    private void printNumbers(Player player, int length) {
        int[] copyNumbers = Arrays.copyOf(player.getNumbers(), length);
        for(int number: copyNumbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
