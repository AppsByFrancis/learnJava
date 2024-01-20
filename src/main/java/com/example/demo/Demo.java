package com.example.demo;

class Human {
    private String name = "Joe";
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name; // this represents the object which is calling the method
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class Demo {
    public static void main (String [] args){
        Human joe = new Human();
//        System.out.println(joe.getName());
        joe.setAge(24);
        joe.setName("Frank");
        System.out.println(joe.getName() + " " + joe.getAge());
    }
}