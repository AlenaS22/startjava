package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private final String name;
    private final int[] numbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // getNumbers() не должен возвращать ссылку на оригинальный массив
    public int[] getNumbers() {
        return Arrays.copyOf(numbers, 10);
    }

    // метод для добавления числа в массив
    public void insertNumber(int number, int index) {
        numbers[index] = number;
    }

    // метод для извлечения числа из массива
    public int getLastNumber(int index) {
        return numbers[index];
    }

    // метод для обнуления введенных чисел в массиве
    public void clearNumbers() {
        int toIndex = 0;
        while (numbers[toIndex] != 0) {
            if (toIndex == 9) {
                break;
            }
            toIndex++;
        }
        Arrays.fill(numbers, 0, toIndex, 0);
    }
}