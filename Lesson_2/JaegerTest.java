import java.util.Scanner;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger gipsyDanger = new Jaeger("Gipsy Danger", "Mark-3", "USA", 79.25f, 1.98f, 7, 8, 6);
        Jaeger chernoAlpha = new Jaeger("Cherno Alpha", "Mark-1", "Russia", 85.34f, 2.412f, 3, 10, 10);
        Scanner scanner = new Scanner(System.in);
        
        // Jaeger 1
        /* gipsyDanger.setModelName("Gipsy Danger");
        gipsyDanger.setMark("Mark-3");
        gipsyDanger.setOrigin("USA");
        gipsyDanger.setHeight(79.25f);
        gipsyDanger.setWeight(1.98f);
        gipsyDanger.setSpeed(7);
        gipsyDanger.setStrength(8);
        gipsyDanger.setArmor(6);
        // Jaeger 2
        chernoAlpha.setModelName("Cherno Alpha");
        chernoAlpha.setMark("Mark-1");
        chernoAlpha.setOrigin("Russia");
        chernoAlpha.setHeight(85.34f);
        chernoAlpha.setWeight(2.412f);
        chernoAlpha.setSpeed(3);
        chernoAlpha.setStrength(10);
        chernoAlpha.setArmor(10); */
        // Jaeger 1 характеристики
        System.out.println("Характеристики Jaeger 1:");
        System.out.println("model name: " + gipsyDanger.getModelName());
        System.out.println("mark: " + gipsyDanger.getMark());
        System.out.println("origin: " + gipsyDanger.getOrigin());
        System.out.println("height: " + gipsyDanger.getHeight());
        System.out.println("weight: " + gipsyDanger.getWeight());
        System.out.println("speed: " + gipsyDanger.getSpeed());
        System.out.println("strength: " + gipsyDanger.getStrength());
        System.out.println("armor: " + gipsyDanger.getArmor());
        // Jaeger 1 действия
        System.out.println("Действия Jaeger 1:");
        System.out.println(gipsyDanger.drift());
        gipsyDanger.go();
        gipsyDanger.run();
        // Jaeger 2 характеристики
        System.out.println("Характеристики Jaeger 2:");
        System.out.println("model name: " + chernoAlpha.getModelName());
        System.out.println("mark: " + chernoAlpha.getMark());
        System.out.println("origin: " + chernoAlpha.getOrigin());
        System.out.println("height: " + chernoAlpha.getHeight());
        System.out.println("weight: " + chernoAlpha.getWeight());
        System.out.println("speed: " + chernoAlpha.getSpeed());
        System.out.println("strength: " + chernoAlpha.getStrength());
        System.out.println("armor: " + chernoAlpha.getArmor());
        // Jaeger 2 действия
        System.out.println("Действия Jaeger 2:");
        chernoAlpha.jump();
        System.out.println(chernoAlpha.scanKaiju());
        // изменение значения поля speed с клавиатуры
        System.out.println("Хотите изменить скорость Jaeger 1 (yes/no)?");
        if(scanner.nextLine().equals("yes")) {
            System.out.println("Введите значение...");
            gipsyDanger.setSpeed(scanner.nextInt());
            System.out.println("Новое значение speed: " + gipsyDanger.getSpeed());
        } else {
            System.out.println("Значение скорости Jaeger 1 выбрано по умолчанию.");
        }
    }
}
