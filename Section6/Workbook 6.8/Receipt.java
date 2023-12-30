public class Receipt {
    public static void main(String[] args) {


        System.out.println("Here's your receipt:\n");

        String[] apples = {"Gala", "Granny Smith", "Macintosh"};
        double[] price = {1.99, 1.49, 1.29};


        for (int i = 0; i < apples.length; i++) {
            for (int j = 0; j < price.length; j++) {
                System.out.println(apples[i] + ":" + price[j]);
            }
        }

        //didn't need to use two dimensional, it doesn't work, just use the same i for both since they are both the same length
        
        // See instructions on Learn the Part (Workbook 6.8)
    
    }
}
