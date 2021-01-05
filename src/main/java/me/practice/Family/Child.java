package me.practice.Family;

public class Child extends Parent {
    int b;
    Child(){
        super(3);
        System.out.println("Child");
        b = 20;
    }

    public static void main(String[] args) {
        System.out.println("hey");
        Child chd = new Child();
        System.out.println(chd.b);
        System.out.println(chd.a);
    }
}

class Parent{
    int a;
    Parent(){
        a = 10;
        System.out.println("Parent");
    }
    Parent(int n){a=n;}
}
