package com.anirudh.introduction;

class Student{
    int rollNo;
    String name;
    float marks;

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
public class CreatingObjects {
    public static void main(String[] args) {
        Student studentObject = new Student();
        studentObject.rollNo = 6;
        studentObject.name = "Anirudh";
        studentObject.marks = 70;

        System.out.println(studentObject);
    }
}
