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

        guessNumber.play();
    }
}