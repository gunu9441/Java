package me.practice.Dispatch;

//public class Dispatch {
//    static class Service{
//        void run(){
//            System.out.println("run");
//        }
//        void run(String msg){
//            System.out.println(msg);
//        }
//    }
//
//    public static void main(String[] args) {
//        new Service().run();
//        new Service().run("Dispatch");
//    }
//}

public class Dispatch {
    static abstract class Service{
        abstract void run();
    }
    static class Myservice1 extends Service{
        @Override
        void run() {
            System.out.println("run1 ");
        }
    }
    static class Myservice2 extends Service{
        @Override
        void run() {
            System.out.println("run2");
        }
    }

    public static void main(String[] args) {
        Service svc = new Myservice1();
        svc.run();
    }
}
