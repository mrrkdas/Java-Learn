import java.util.Scanner;

public class Guess  {
    public static void main(String[] args) {

       System.out.print("I chose a number between 1 and 5. Try to guess it: ");
        
       Scanner scan = new Scanner(System.in);

       int number = 5;

       int guess = scan.nextInt();

       while (guess != number) {
        System.out.print("Guess Again: ");
        guess = scan.nextInt();
            
       } // you don't need an if statement, if you just put it outside, you can say you got it because their is nothing saying that if it is coreect you stay in the loop.
       
       System.out.println("You got it!!");
       //See Learn the Part for detailed instructions.
        
        scan.close();
    }

}
