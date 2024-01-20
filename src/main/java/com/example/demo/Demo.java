package com.example.demo;

class Human {
    private String name = "Joe";
    private int age;

    public String getName(){
        return name;
    }
    public int getAge (){
        return age;
    }
    public void setName(String a){
        name = a;
    }
    public void setAge (int a){
        age = a;
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