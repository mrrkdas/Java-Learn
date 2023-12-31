public class Prices {
    public static void main(String[] args) {
        // The instructions for this workbook are on Learn the Part (workbook 6.13)
        //double[][] prices = new double[3][5]; creation and then when you are done you can just do prices[0][1] and go on through  each column and row.

        double[][] prices = {
            {12.99, 8.99, 9.99, 10.49, 11.99},
            {0.99, 1.99, 2.49, 1.49, 2.99},
            {8.99, 7.99, 9.49, 9.99, 10.99}
        };

        for (int i = 0; i < prices.length; i++) {
            switch (i) {
                case 0: System.out.print("Baking: "); break;
                case 1: System.out.print("Beverage: "); break;
                case 2: System.out.print("Cereals: "); break;
            }
            for (int j = 0; j < prices.length; j++) {
                System.out.print(prices[i][j] + " ");
                System.out.print("\n");
            }
        }
    }
}
