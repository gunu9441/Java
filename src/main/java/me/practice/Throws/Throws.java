package me.practice.Throws;

public class Throws {
    public void sayNick(String nick){
        try{
            if("fool".equals(nick)){
                throw new FoolException();
            }
            System.out.println("Your character is "+nick);
        } catch( FoolException e){
            System.err.println("FoolException occurs");
        }
    }

    public static void main(String[] args) {
        Throws thrw = new Throws();
        thrw.sayNick("fool");
        thrw.sayNick("genious");
    }
}
