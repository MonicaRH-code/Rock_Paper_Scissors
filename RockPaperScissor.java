import java.util.Scanner;
import java.util.Random;
public class RockPaperScissor {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Wecome to the amazing game of ROCK-PAPER-SCISSOR");
        System.out.println("Enter user choice");
        String l=scan.nextLine();
        String u=l.toUpperCase(); 
        String c;
        int n=rand.nextInt(3) ;
        if(n==0)
        {
        c= "ROCK";
        }
        else if(n==1)
        {
            c="PAPER";
        }else
        {
            c="SCISSOR";
        }
        System.out.println("Computer's choice ->" + c);

        if(u.equals("ROCK")  && c.equals("PAPER" ))
        {
            System.out.println("computer wins the game");
        }
        else if(u.equals("ROCK")&& c.equals("SCISSOR"))
        {
          System.out.println("User wins the game");
        }
        else if(u.equals("PAPER") && c.equals("SCISSOR"))
        {
            System.out.println("Computer wins the game");
        }
        else if(u.equals("PAPER") && c.equals("ROCK"))
        {
            System.out.println("User wins the game");
        }
        else if(u.equals("SCISSOR") && c.equals("ROCK"))
        {
            System.out.println("Computer wins the game");
        }
        else if(u.equals("SCISSOR") && c.equals("PAPER"))
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
