package com.startjava.lesson_2_3.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setGender("самец");
        wolfOne.setName("Акела");
        wolfOne.setWeight(50);
        wolfOne.setAge(10);
        wolfOne.setColor("серый");

        System.out.println("Кличка волка - " + wolfOne.getName() + '.');
        System.out.println("Он " + wolfOne.getGender() + '.');
        System.out.println("Его вес " + wolfOne.getWeight() + " кг, возраст " + wolfOne.getAge() + " лет, а цвет - " + wolfOne.getColor() + '.');
        wolfOne.go();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}