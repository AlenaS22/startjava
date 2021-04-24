// TODO
// Модифицируйте программу Угадай число:
// используйте массив для хранения в классе Player, введенных игроком чисел
// после запуска игры выведите сообщение о том, что у каждого игрока по 10 попыток
// в конце игры выведите сообщение "Игрок " + имя + " угадал число " + число + " с " + номер + " попытки"
// если у игрока закончились попытки, то отобразите сообщение: "У " + имя + " закончились попытки"
// по окончанию игры отобразите, в две строки через пробел, все названные игроками числа (даже если никто не выиграл)
// если массив полностью не заполнен, т.е. пользователь угадал число менее чем за 10 попыток, то выводить весь массив не нужно
// для получения части массива используйте метод Arrays.copyOf
// для обнуления массива, при повторном запуске игры, используйте метод Arrays.fill(). При этом обнуляйте только те ячейки,
// где хранятся, названные игроками числа, а не весь массив
// попробуйте улучшить читаемость кода, разделив его на небольшие методы (рефакторинг)

package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя первого игрока:");
        Player player1 = new Player(scanner.nextLine());
        System.out.println("Введите имя второго игрока:");
        Player player2 = new Player(scanner.nextLine());
        // созданных игроков передавайте в игру через ее конструктор и присвойте двум полям типа Player
        GuessNumber guessNumber = new GuessNumber(player1, player2);
        String answer;
        
        do {
            guessNumber.play();
            do {
                System.out.println("Хотите продолжить игру? [yes/no]");
                answer = scanner.nextLine();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equals("yes"));
    }
}
