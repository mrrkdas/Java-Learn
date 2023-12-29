import java.util.Scanner;

public class CountingTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What number do you want to count to: ");
        int number = scan.nextInt();


        for (int i=0; i<=number; i++) {
            System.out.print(i);
        }
        // See Learn the Part for the instructions.
        
        scan.close();
    }
}
