import java.util.Scanner;

public class JavaRolls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // See Learn the Part for detailed instructions.
        System.out.println("Let's play Rolling Java. Type anything to start.");
        scan.nextLine();
        System.out.println("Great, here are the rules:\\n");
        System.out.println("If you roll a 6, the game stops.");
        System.out.println("Otherwise, you get 1 point.\\n");
        System.out.println("You must collect at least 3 points to win. Enter anything to roll: ");
        
                
        int diceRoll;
        int score = 0;


        while (true) {
            scan.nextLine();
            diceRoll = rollDice();
            if (diceRoll == 6) {
                break;
            } else if (diceRoll == 4) {
                System.out.println("Keep Rolling 0 points");
            } else {
                score++;
            }
            
        }

        if (score >= 3 ) {
            System.out.println("Wow, that's lucky. You win!");
        } else {
            System.out.println("Tough luck, you lose :(");
        }







    }

    public static int rollDice() {
        double randomNumber = Math.random() * 6;
        randomNumber = randomNumber + 1;
        return (int)randomNumber;
    }
  
  

  
  
}
