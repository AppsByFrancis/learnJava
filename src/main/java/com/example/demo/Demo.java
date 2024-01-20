package com.example.demo;

class A{
    public A(){
        System.out.println("in constructor A");
    }
    public A(int n){
        System.out.println("in constructor int A");
    }
}
class B extends A{
    public B(){
        System.out.println("in constructor A");
    }
    public B(int n){
        super(n); //
        System.out.println("in constructor int A");
    }
}
public class Demo {
    public static void main (String [] args){
    }
}

// The main constructor of the parent class fires first, if argument isn't passed to super function
// of child parametrized constructor
// Later, the child class' parametrized function fires if argument is passed