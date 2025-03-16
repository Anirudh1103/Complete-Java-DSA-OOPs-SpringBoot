package com.anirudh.introduction;

import java.util.Arrays;

class Student{
    int rollNo;
    String name;
    float marks;
}
public class Main {
    public static void main(String[] args) {
        //Primitive data type
        int[] arr = new int[5];
        //Non Primitive data type
        Integer[] arr2 = new Integer[5];
        //Non-Primitive data type -> Student
        Student[] stuArr = new Student[5];

        System.out.println("Primitive data type: " + Arrays.toString(arr));
        System.out.println("Non-Primitive data type: " + Arrays.toString(arr2));
        System.out.println("Non-Primitive data type -> Student: " + Arrays.toString(stuArr));
    }
}
