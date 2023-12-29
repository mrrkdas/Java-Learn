import java.util.Scanner;

public class SignIn {
    public static void main(String[] args) {
        String username = "Samantha";
        String password = "Java <3";
        
        /* Task 1 
            1. Pick up a username and password from the user.
       */
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWelcome to Javagram! Sign in below\n");
        System.out.print("- Username: ");
        //pick up username
        String inputedUsername = scan.nextLine();
        System.out.print("- Password: ");
        //pick up password
        String inputedPassword = scan.nextLine();

        // see Learn the Part for the remaining instructions.
        
        while (inputedUsername != username || inputedPassword != password) {
            System.out.println("\nIncorrect, please try again!\n");
            System.out.print("- Username: ");
            inputedUsername = scan.nextLine();
            System.out.print("- Password: ");
            inputedPassword = scan.nextLine();
        }

        System.out.println("sign in succesful");
        
        
        scan.close();
        
    }
}
