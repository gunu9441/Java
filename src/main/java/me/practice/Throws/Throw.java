package me.practice.Throws;

public class Throw {
    public void sayNick(String nick){
        try{
            if("fool".equals(nick)){
                throw new FoolException("FoolException!!");
            }
            System.out.println("Your character is "+nick);
        } catch( FoolException e){
            System.err.println("FoolException occurs");
        }
    }

    public static void main(String[] args) {
        Throw thrw = new Throw();
        thrw.sayNick("fool");
        thrw.sayNick("genious");
    }
}
