import java.util.Scanner;

public class CounterTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("I hear you like to count by threes\n");
        System.out.println("Jimmy: It depends.");
        System.out.println("Oh, ok...");

        System.out.print("Pick a number to count by: ");
        int numberToCountBy = scan.nextInt();

        System.out.print("Pick a number to start from: ");
        scan.nextLine();
        int numberToStartFrom = scan.nextInt();

        System.out.print("Pick a number to count until: ");
        scan.nextLine();
        int numberToCountUntil = scan.nextInt();


        for (int i = numberToStartFrom; i<=numberToCountUntil; i+=numberToCountBy) {
            System.out.print(i + " ");
        }

       // See detailed instructions on Learn the Part.

        scan.close();
    }
}
