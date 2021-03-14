public class Unicode {
    public static void main (String[] args) {
        char symbol;

        for(char i = 33; i < 127; i++) {
            symbol = i;
            System.out.println((int) symbol + ". " + symbol);
        }
    }
}