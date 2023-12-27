import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        
        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

        Scanner scan = new Scanner(System.in);
        System.out.println("\n****ROYAL BANK OF JAVA****");
        System.out.println("Are you here to get a mortgage? (yes or no)");
        String result = scan.nextLine();
        if (result.equals("yes")) {
            System.out.println("\nGreat! In one line" +
            "\nHow much money do you have in your savings?" +
            "\nAnd, how much do you owe in credit card debt?");



        //Task 2 - Print this if the decision is "yes"
            System.out.println("\nGreat! In one line" +
            "\nHow much money do you have in your savings?" +
            "\nAnd, how much do you owe in credit card debt?");
                // Task 3 - Pick up each value 
            double savingsAmount = scan.nextDouble();
            double creditCardDebt = scan.nextDouble();
            System.out.println("\nHow many years have you worked for?");
            int yearsWorked = scan.nextInt();
               // Task 4 - Pick up number of years

            System.out.println("What is your name?");
             scan.nextLine();
            String name = scan.nextLine();
               // Task 5 - Pick up the user's name
                
               //Task 6 - Approve the mortgage if they meet the requirements (see article)
               //       - Otherwise, don't give them a mortgage.        
               if ((savingsAmount >= 10000) && (creditCardDebt <=5000) && (yearsWorked > 2))  {
                System.out.println("Congratulations" + name + "You have been approved!");
               } else {
                System.out.println("Sorry, you are not eligible for a mortgage.");

               }
               
               

        } else {
            System.out.println("\nOK. Have a nice day!");
        }

        //Task 2 - Print this if the decision was not "yes"
       


        scan.close();
    }
}
