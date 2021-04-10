import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Random randomNumberGenerator = new Random();
    Scanner scanner = new Scanner(System.in);
    private int numberOfComputer;
    private int numberOfPlayer;
    private Player player1;
    private Player player2;
    private String answer;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        do {
            numberOfComputer = randomNumberGenerator.nextInt(100) + 1;
            do {
                inputNumber(player1);
                if(compareNumbers()) {
                    break;
                } else {
                inputNumber(player2);
                }
            } while(!compareNumbers());
            scanner.nextLine();
            do {
                System.out.println("Хотите продолжить игру? [yes/no]");
                answer = scanner.nextLine();
            } while(!answer.equals("yes") && !answer.equals("no"));
        } while(answer.equals("yes"));
    }

    private void inputNumber(Player player) {
        System.out.println('\n' + player.getName() + ", введите число от 1 до 100");
        player.setNumber(scanner.nextInt());
        numberOfPlayer = player.getNumber();
    }

    private boolean compareNumbers() {
        if(numberOfPlayer != numberOfComputer) {
            if(numberOfPlayer < numberOfComputer) {
                System.out.println("Введенное число " + numberOfPlayer + " меньше того, что загадал компьютер.");
            } else {
                System.out.println("Введенное число " + numberOfPlayer + " больше того, что загадал компьютер.");
            }
            return false;
        } else {
            System.out.println("Вы угадали! Число, загаданное компьютером, равняется " + numberOfComputer + "!");
            return true;
        }
    }
}

