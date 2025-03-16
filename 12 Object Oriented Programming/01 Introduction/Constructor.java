package com.anirudh.introduction;

class Student{
    int rollNo;
    String name;
    float marks;

    //Constructor
    Student(int rollNo, String name, float marks)
    {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
public class Constructor {
    public static void main(String[] args) {
        Student stu1 = new Student(6,"Anirudh",70);
        System.out.println(stu1);
    }
}
