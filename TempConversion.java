import java.util.Scanner;
public class TempConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit : ");
        double fahrenheit = scanner.nextDouble();

        // double kelvin = (fahrenheit + 459.67) * 5 / 9;
        double kelvin = ((fahrenheit - 32) * 5 / 9) + 273.15;

        // System.out.println("Temperature in Kelvin: " + kelvin);
        System.out.printf("%.2f degrees Fahrenheit is %.2f Kelvin", fahrenheit, kelvin);
    }
}

