package me.practice.Family;

public class Child extends Parent {
    public String name;

    Child(String name){
        super();
        System.out.println("Child");
        this.name = name;
    }

    public void show_name(){
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        Parent p = new Child("Korea");
        p.show();
        System.out.println(p.population);
        System.out.println(p.name);
    }
}

class Parent{

    public String name;
    public String population;
    public String capital;

    Parent(){
        System.out.println("Parent");
        this.name = "country";
        this.capital = "capital";
        this.population = "population";
    }

    public void show(){
        System.out.println("parent");
        System.out.println(this.name + this.capital + this.population);
    }

    public void show_print(){
        System.out.println("print function");
    }
}
