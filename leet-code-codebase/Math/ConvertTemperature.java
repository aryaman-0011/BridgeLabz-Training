import java.util.Scanner;

public class ConvertTemperature {

    // Funtion to convert temperature
    public static double[] convertTemperature(double celsius) {

        double kelvin = celsius + 273.15;
        double fahrenheit = (celsius * 1.80) + 32.00;

        return new double[]{kelvin, fahrenheit};
    }

    public static void main(String[] args) {

	// Take user input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        double[] result = convertTemperature(celsius);

        System.out.println("Kelvin: " + result[0]);
        System.out.println("Fahrenheit: " + result[1]);

        sc.close();
    }
}
