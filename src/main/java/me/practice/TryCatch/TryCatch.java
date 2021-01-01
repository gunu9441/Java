package me.practice.TryCatch;

public class TryCatch {
    public void shouldbeRun(){
        System.out.println("essential");
    }

    public static void main(String[] args) {
        TryCatch trycatch = new TryCatch();
        int a;
        try{
            a = 4/0;
        }catch (ArithmeticException e){
            a = -1;
        }finally {
            trycatch.shouldbeRun();
        }
    }
}
