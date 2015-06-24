import java.util.Scanner;

/**
 * Created by Siuxoes on 24/06/2015.
 */
public class Exer46OneShotHiLo {

    private Scanner in;

    public int generateNumber(){
        return (int) (Math.random() * 100 + 1);
    }

    public int askNumberUser(){
        in = new Scanner(System.in);
        System.out.println("I'm thinking of a number between 1-100.  Try to guess it. ");
        return in.nextInt();
    }

    public void checkNumber(int random, int user){
        if(random == user){
            System.out.println("You guessed it!  What are the odds?!?");
        }else{
            if(user > random){
                System.out.println("Sorry, you are too high.  I was thinking of " + random);
            }else{
                System.out.println("Sorry, you are too low.  I was thinking of " + random);
            }
        }
    }

    public static void main(String[] args){
        Exer46OneShotHiLo exer46OneShotHiLo = new  Exer46OneShotHiLo();
        int random = exer46OneShotHiLo.generateNumber();
        int user = exer46OneShotHiLo.askNumberUser();
        exer46OneShotHiLo.checkNumber(random, user);
    }
}
