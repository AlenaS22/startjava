package com.startjava.lesson1.cycle;

public class Cycle {
    public static void main(String[] args) {
        for(int i = 0; i <= 20; i++) {
            System.out.println(i);
        }
        System.out.println("---");
        
        int i = 6;
        while(i >= -6) {
            System.out.println(i);
            i -= 2;
        }
        System.out.println("---");

        i = 11;
        int sum = 0;
        do {
            sum += i;
            i += 2;
        } while(i < 20);
        System.out.println(sum);
    }
}