package com.anirudh.lecture2;

class Human{
    String name;
    int age;
    char gender;
    boolean married;
    static long population;

    public Human(String name, int age, char gender, boolean married) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.married = married;
        Human.population += 1;
    }
}
public class StaticDemonstration {
    public static void main(String[] args) {
        Human anirudh = new Human("Anirudh",22,'M',false);
        Human chaithra = new Human("Chaithra", 21,'F',false);

        System.out.println(Human.population);
    }
}
