import java.util.Scanner;

public class PizzaParty {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      // Below this comment: declare any variables you may need
      int numPizzas;
      int slicesPerPizza;
      int totalSlices;
      
      int numAdults;
      int numKids;
      
      int remainingSlices;
      int slicesPerChild;
      
      int leftoverSlices;
      
      
      // Below this comment: collect the required inputs
      // be sure to declare any variables you will need to store each input
      System.out.print("Number of pizzas purchased : ");
      numPizzas = scnr.nextInt();
      System.out.print("Number of slices per pizza : ");
      slicesPerPizza = scnr.nextInt();
      System.out.print("Number of adults           : ");
      numAdults = scnr.nextInt();
      System.out.print("Number of children         : ");
      numKids = scnr.nextInt();
      
      totalSlices = numPizzas * slicesPerPizza;
      // Below this comment: write Java code to do the computations needed to determine the correct output values
      // Be sure to break down complex computations into simpler computations,
      // and store the intermediate values in variables that you can use for further computations.
      remainingSlices = totalSlices - (2 * numAdults);
      slicesPerChild = remainingSlices / numKids;
      leftoverSlices = remainingSlices - (slicesPerChild * numKids);
      
      // Below this comment: output the correct output values that you computed above
      // make sure that your outputs are formatted exactly like the Expected Outputs in the Test Data examples
      System.out.println("Number of slices each child will get is : " + slicesPerChild);
      System.out.println("Number of slices left over is           : " + leftoverSlices);
      
      // System.out.println("Remaining Slices : " + remainingSlices);
      // System.out.println("Slices Per Child : " + slicesPerChild);
      // System.out.printf("Slices Leftover : " + leftoverSlices);
   }
}