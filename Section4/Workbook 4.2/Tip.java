public class Tip {

    public static void main(String[] args) {
        double bill = 53.5;
        System.out.println("Waiter: I hope you enjoyed your meal!");
        System.out.println("Thank you!");
    
        //Task 2: Call a function that tips the waiter.
    }



    
    //Task 1: Make a function here. See the doc comment for details.  

    /**
     * Function name: tipTheWaiter - calculates a tip and prints it.
     * @param bill (double).
     * 
     * Inside the function:
     *  1. Calculates a tip that's 15 percent of bill.
     *  2. Prints: Your service was wonderful! Please, accept this tip: $<tip>
     */

     public static void tipTheWaiter(double bill) { //parameters are the things that are needed to run the functions, arguments are the values that get passd into the function
        double tip = 0.15 * bill;
        System.out.println("our service was wonderful! Please, accept this tip: $" + tip);
     }

}