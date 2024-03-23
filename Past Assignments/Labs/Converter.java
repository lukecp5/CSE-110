import java.util.Scanner;

public class Converter {
   public static void main(String[] args) {
      // Below this comment: declare and instantiate a Scanner
      Scanner input = new Scanner(System.in);
      
      // Below this comment: declare any variables you may need
      double meters;   
      int feet = 0;
      double inches = 0;
      double temp = 0;
      double tempInches = 0;
      
      // Below this comment: collect the required inputs
      System.out.print("Enter distance in Meters : ");
      meters = input.nextDouble();
      
      
      // Figure out the amount of feet in a meter and store it
      temp = meters * 3.28;
      feet = (int)temp;
      System.out.println("temp:    " + temp);      
      
      
      // the 12 inches for each foot
      tempInches = meters * 39.37;
      inches = tempInches - ((double)feet * 12);
      
      //Below this comment: output the correct output values that you computed above
      System.out.printf("%.2f meters in Feet and Inches is : %d\' %.2f\"\n", meters, feet, inches);
      
      
      
   }
}
