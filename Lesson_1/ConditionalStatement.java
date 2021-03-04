public class ConditionalStatement {
    public static void main(String[] args) {
    int age = 25;
    if(age > 20) {
        System.out.println("Человек старше 20 лет");
    }

    char gender = 'ж';
    if(gender == 'м') {
        System.out.println("Человек мужского пола");
    }

    if(gender != 'м') {
        System.out.println("Человек женского пола");
    }
    
    float growth = 1.95f;
    if(growth < 1.80) {
        System.out.println("Рост человека меньше 1 м 80 см");
    } else {
        System.out.println("Рост человека больше 1 м 80 см");
    }

    char firstCharacter = 'I';
    if(firstCharacter == 'M') {
        System.out.println("Первая буква имени 'M'");
    } else if(firstCharacter == 'I') {
        System.out.println("Первая буква имени 'I'");
    } else {
        System.out.println("Первая буква имени не 'M' и не 'I'");
    }
}
}