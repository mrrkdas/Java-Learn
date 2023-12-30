public class RandomNumbers {
    public static void main(String[] args) {

        int[][] array = new int[100][10];
        
        // The instructions for this workbook are on Learn the Part (Workbook 6.14)
        

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = randomNumber();
            }
        }

        print2DArray(array);
        
    }

    public static int randomNumber() {
        double randomNumber = Math.random()*100;
        return (int)randomNumber;
    }

    public static void print2DArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
                System.out.print("\n");
            }
        }
    }



}
