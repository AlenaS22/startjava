public class MyFirstGame {
    public static void main(String[] args) {
        int valueOfComputer = 15;
        int valueOfGamer = 0;

        while(valueOfGamer != valueOfComputer) {
            if(valueOfGamer < valueOfComputer) {
                System.out.println("Введенное вами число " + valueOfGamer +
                " меньше того, что загадал компьютер");
                valueOfGamer += 2;
            } else {
                System.out.println("Введенное вами число " + valueOfGamer +
                " больше того, что загадал компьютер");
                valueOfGamer--;
            }
        }
        System.out.println("Вы угадали! Число, загаданное компьютером, равняется " +
        valueOfComputer + "!");
    }
}