package me.practice.Abstract.Actual;

import me.practice.Abstract.Abstract;

public class Actual extends Abstract {
    public static int car;
    public Actual(){
        this.Kind = "Dog";
    }
    public void breath(){

    }
    public void sound(){

    }
    public static void main(String[] args) {
        Actual actual = new Actual();
        actual.breath();

    }
}
