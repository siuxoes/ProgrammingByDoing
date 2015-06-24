/**
 * Created by Siuxoes on 24/06/2015.
 */
import java.util.Scanner;

public class Exer37GenderGame {

    private String gender;
    private String fName;
    private String lName;
    private int age;
    private boolean married;
    private Scanner in;

    public Exer37GenderGame(){
        String n = "Then I shall call you ";
        in = new Scanner(System.in);
        System.out.println("What is your gender(M o F): ");
        gender = in.nextLine();
        System.out.println("What is your first name? ");
        fName = in.nextLine();
        System.out.println("What is your last name? ");
        lName = in.nextLine();
        System.out.println("What is your age?");
        age = Integer.parseInt(in.nextLine());
        if(gender.equals("F")){
            if(age < 20){
                System.out.println(n + fName + " " +lName);
            }else{
                System.out.println("Are you married?(Yes o no)");
                married = return (in.nextLine()).equals("Yes");

            }
        }else{
            if(age < 20){
                System.out.println(n + fName + " " +lName);
            }else{
                System.out.println(n + " Mr. "+lName);
            }
        }
    }
}
