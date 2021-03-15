public class Unicode {
    public static void main(String[] args) {
        for(char symbol = 33; symbol < 127; symbol++) {
            System.out.println((int) symbol + ". " + symbol);
        }
    }
}