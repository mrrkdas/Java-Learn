public class Weather {
    public static void main(String[] args) {
        
        // The instructions for this workbook are on Learn the Part (Workbook 6.11)
        double[] celsius = {12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0};
        double[] fahrenheit = celciusToFahrenheit(celsius);

        printTemperatures(fahrenheit, "farenheit");
        printTemperatures(celsius, "celcius");

        
        

    }

    public static double[] celciusToFahrenheit(double[] celcius) {
        double[] fahrenheit = new double[celcius.length];

        for (int index = 0; index < celcius.length; index++) {
            fahrenheit[index] = (((celcius[index]/5) * 9) +32);
        }

        return fahrenheit;
    }

    public static void printTemperatures(double[] temp, String tempType) {
        for (int i = 0; i < temp.length; i++) {
            System.out.print(tempType + ":" + temp[i] +"\n");
        }
    }
}
