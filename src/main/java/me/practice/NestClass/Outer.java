package me.practice.NestClass;

public class Outer {
    static int num = 0;
    int boy = 1;
    public void change(){
        Inner inner = new Inner();
        inner.Inner_num = 5;
        static_Inner.hey = 3;
//        static_Inner.hooly = 5; => error
        static_Inner moy = new static_Inner();
        moy.hooly = 5;
    }
    static class static_Inner{
        int hooly = 10000;
        static int hey = 3;
        public void display(){
            num = 3;
            Outer outer = new Outer();
            outer.boy = 3;
        }
    }
    class Inner{
        int Inner_num = 3;
        public void display(){
            boy = 3;//outer_instace
            num = 0;//outer_static
        }

    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner =  outer. new Inner();
        Outer.static_Inner sInner =  new  Outer.static_Inner();
        static_Inner sonner = new static_Inner();
        System.out.println(sonner.hooly);
        System.out.println(sInner.hooly);
    }
}
