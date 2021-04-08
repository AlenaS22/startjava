public class GuessNumber {
    private int numberOfComputer;
    private int numberOfPlayer;

    public void setNumberOfComputer(int numberOfComputer) {
        this.numberOfComputer = numberOfComputer;
    }

    public void setNumberOfPlayer(int numberOfPlayer) {
        this.numberOfPlayer = numberOfPlayer;
    }

    public boolean play() {
        if(numberOfPlayer != numberOfComputer) {
            if(numberOfPlayer < numberOfComputer) {
                System.out.println("Введенное Вами число " + numberOfPlayer + " меньше того, что загадал компьютер.");
            } else {
                System.out.println("Введенное Вами число " + numberOfPlayer + " больше того, что загадал компьютер.");
            }
            return false;
        } else {
            System.out.println("Вы угадали! Число, загаданное компьютером, равняется " + numberOfComputer + "!");
            return true;
        }
    }
}