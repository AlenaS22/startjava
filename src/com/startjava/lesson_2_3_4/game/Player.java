package com.startjava.lesson_2_3_4.game;

public class Player {
    private final String name;
    private final int[] numbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getNumbers() {
        return numbers;
    }

    // метод для добавления числа в массив
    public void insertNumber(int number, int index) {
        numbers[index] = number;
    }

    // метод для извлечения числа из массива
    public int selectNumber(int index) {
        return numbers[index];
    }
}