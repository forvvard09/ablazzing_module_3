package org.example.module_3.lesson2;

public class Lesson2 {
    public static void main(String[] args) {
        HumanB humanB = HumanB.builder()
                .name("Petr")
                .age(20)
                .isMale(true)
                .build();

        System.out.println(humanB);
    }
}
