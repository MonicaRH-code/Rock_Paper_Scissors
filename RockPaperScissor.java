import java.util.Scanner;
import java.util.Random;
public class RockPaperScissor {

    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Wecome to the amazing game of Rock-Paper-Scissor");
        System.out.println("Enter user choice");
        String u=scan.nextLine();
        String c;
        int n=rand.nextInt(3) ;
        if(n==0)
        {
        c= "Rock";
        }
        else if(n==1)
        {
            c="Paper";
        }else
        {
            c="Scissor";
        }
        System.out.println("Computer's choice ->" + c);

        if(u.equals("Rock")  && c.equals("Paper" ))
        {
            System.out.println("computer wins the game");
        }
        else if(u.equals("Rock")&& c.equals("Scissor"))
        {
          System.out.println("User wins the game");
        }
        else if(u.equals("Paper") && c.equals("Scissor"))
        {
            System.out.println("Computer wins the game");
        }
        else if(u.equals("Paper") && c.equals("Rock"))
        {
            System.out.println("User wins the game");
        }
        else if(u.equals("Scissor") && c.equals("Rock"))
        {
            System.out.println("Computer wins the game");
        }
        else if(u.equals("Scissor") && c.equals("Paper"))
        {
            System.out.println("User wins the game");
        }
        else if(u.equals(c)){
            System.out.println("Draw");
        }
        else 
        {   
            System.out.println("Please give correct input");
        }


    }
    
}
