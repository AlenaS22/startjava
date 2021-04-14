package com.startjava.lesson_2_3.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    private int secretNumber;
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        secretNumber = random.nextInt(100) + 1;
        do {
            inputNumber(player1);
            if(compareNumbers(player1)) {
                break;
            }
            inputNumber(player2);
        } while(!compareNumbers(player2));
    }

    private void inputNumber(Player player) {
        System.out.println('\n' + player.getName() + ", введите число от 1 до 100");
        player.setNumber(scanner.nextInt());
    }

    private boolean compareNumbers(Player player) {
        if(player.getNumber() == secretNumber) {
            System.out.println("Вы угадали! Число, загаданное компьютером, равняется " + secretNumber + "!");
            return true;
        }
        if(player.getNumber() < secretNumber) {
            System.out.println("Введенное число " + player.getNumber() + " меньше того, что загадал компьютер.");
        } else {
            System.out.println("Введенное число " + player.getNumber() + " больше того, что загадал компьютер.");
        }
        return false;
    }
}