package me.practice.Throws;

public class Throws{
    public void sayNick(String nick) throws FoolException{
        if("fool".equals(nick))
            throw new FoolException();
        System.out.println("Your character is "+ nick);
    }
    public static void main(String[] args){
        Throws thrw = new Throws();
        try{
            thrw.sayNick("fool");
            thrw.sayNick("genious");
        }catch(FoolException e){
            System.err.println("FoolException occurs");
        }
    }
}