import java.util.Scanner;
import java.util.Random;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random randomNumberGenerator = new Random();
        System.out.println("Введите имя первого игрока:");
        Player player1 = new Player(scanner.nextLine());
        System.out.println("Введите имя второго игрока:");
        Player player2 = new Player(scanner.nextLine());
        // создание объекта "Игровой процесс"
        GuessNumber guessNumber = new GuessNumber();
        String answer;

        do {
            // генерация случайного числа для компьютера и передача в "Игровой процесс"
            guessNumber.setNumberOfComputer(randomNumberGenerator.nextInt(100) + 1);
            do {
                System.out.println("Введите число от 1 до 100 для первого игрока:");
                player1.setNumber(scanner.nextInt());
                guessNumber.setNumberOfPlayer(player1.getNumber());
                if(guessNumber.play()) {
                    break;
                } else {
                    System.out.println("Введите число от 1 до 100 для второго игрока:");
                    player2.setNumber(scanner.nextInt());
                    guessNumber.setNumberOfPlayer(player2.getNumber());
                }
            } while(!guessNumber.play());
            scanner.nextLine();
            do {
                System.out.println("Хотите продолжить игру? [yes/no]");
                answer = scanner.nextLine();
            } while(!answer.equals("yes") && !answer.equals("no"));
        } while(answer.equals("yes"));
    }
}