package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private final String name;
    private final int[] numbers = new int[10];
    private int sizeNumbers;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // getNumbers() не должен возвращать ссылку на оригинальный массив
    public int[] getNumbers() {
        //  copyOf возвращает только введенные игроком числа
        return Arrays.copyOf(numbers, sizeNumbers);
    }

    // метод для добавления числа в массив
    public void setNumber(int number) {
        numbers[sizeNumbers++] = number;
    }

    // метод для извлечения числа из массива
    public int getLastNumber(int index) {
        return numbers[index];
    }

    // метод для обнуления введенных чисел в массиве и sizeNumbers
    public void clearNumbers() {
        Arrays.fill(numbers, 0, sizeNumbers, 0);
        sizeNumbers = 0;
    }
}
