public class Variable {
    public static void main(String[] args) {
        byte core = 2;
        short cpu = 4;
        int ram = 8;
        long verOfBoard = 1;
        float frequency = 2.3f;
        double verOfSmbios = 3.1d;
        char type = 'i';
        boolean secure = true;

        System.out.println(core + "\n" + cpu + "\n" + ram + "\n" +
            verOfBoard + "\n" + frequency + "\n" + verOfSmbios +
            "\n" + type + "\n" + secure);
    }
}