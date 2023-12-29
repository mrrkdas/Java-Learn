public class FizzBuzz {
    public static void main(String[] args) {

        // See Learn the Part for detailed instructions.
        /*for (int i = 0; i <=18; i++) {
            if (i % 3 == 0) {
                System.out.print(i + "Fizz");
            } else if (i % 5 == 0) {
                System.out.print(i + "Buzz");
            } else {
                System.out.print(i + "FizzBuzz");
            }
        }*/

        // correct answer
        for (int i = 0; i <=18; i++) {
            if (i%3==0 && i%5==0) {
                System.out.print(i + "FizzBuzz");
            } else if (i%3 == 0) {
                System.out.println(i + " Fizz");
            } else if (i % 5 == 0) {
                System.out.println(i + " Buzz");
            }
        }
    }

}
