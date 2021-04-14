package com.startjava.lesson1.game;

public class MyFirstGame {
    public static void main(String[] args) {
        int numberOfComputer = 15;
        int numberOfPlayer = 0;

        while(numberOfPlayer != numberOfComputer) {
            if(numberOfPlayer < numberOfComputer) {
                System.out.println("Введенное вами число " + numberOfPlayer + " меньше того, что загадал компьютер");
                numberOfPlayer += 2;
            } else {
                System.out.println("Введенное вами число " + numberOfPlayer + " больше того, что загадал компьютер");
                numberOfPlayer--;
            }
        }
        System.out.println("Вы угадали! Число, загаданное компьютером, равняется " + numberOfComputer + "!");
    }
}