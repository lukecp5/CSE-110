import java.util.Scanner; 
public class TempConversion2 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter temperature in Kelvin: ");
            double kelvin = input.nextDouble();

            double fahrenheit = (kelvin - 273.15) * 9 / 5 + 32;

            System.out.printf("%.2f degrees Kelvin is %.2f Fahrenheit%n", kelvin, fahrenheit);

            input.close();
        }
    }
