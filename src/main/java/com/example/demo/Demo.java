package com.example.demo;

class Student{
    int rollno;
    String name;
    int marks;
}
public class Demo {
    public static void main(String [] args){
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Joe";
        s1.marks = 100;

        Student s2 = new Student();
        s2.rollno = 1;
        s2.name = "Michael";
        s2.marks = 96;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Frank";
        s3.marks = 92;

        Student students [] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i=0; i < students.length; i++){
            System.out.println(students[i].name);
        }


    }
}
