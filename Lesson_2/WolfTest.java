public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.gender = "самец";
        wolfOne.name = "Акела";
        wolfOne.weight = 50;
        wolfOne.age = 10;
        wolfOne.color = "серый";

        System.out.println("Кличка волка - " + wolfOne.name + '.');
        System.out.println("Он " + wolfOne.gender + '.');
        System.out.println("Его вес " + wolfOne.weight + "кг, возраст " + wolfOne.age + " лет, а цвет - " + wolfOne.color + '.');
        wolfOne.go();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}