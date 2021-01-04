package me.practice.This;

public class test {
    private int number;

    private String string;

    public test(int number){
        this.number=  number;
    }

    public test(){
        this.string = "whiteship";
    }

    public static void main(String[] args) {
        test Test = new test(3);
        System.out.println(Test.number);
        System.out.println(Test.string);
    }
}
