package com.anirudh.lecture2;

//This program is a demo to show initialisation of static variables
public class StaticBlock {
    static int a;
    /*
    Here we are not initializing the value to static variable a.
    We can implement a static block which will automatically run only once whenever a program is executed
     */
    static {
        System.out.println("I'm in static block initializing value for a");
        a = 10;
    }

    public static void main(String[] args) {
        System.out.println(StaticBlock.a);
    }
}
