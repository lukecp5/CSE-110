import java.util.Scanner;

public class Asphalt {
    public static void main(String[] args) {
        // Instantiating the scanner
        Scanner in = new Scanner(System.in);



        // Variable Declarations 
        double ASPHALT_WEIGHT = 145;
        double ASPHALT_COST = 150;
        double TRUCK_CAPACITY = 10000; // 5 tons of asphalt

        
        double miles = 0;
        int lanes = 0;
        int inches = 0;


        double cubicFeet = 0; // Note: (Miles * 5280) * (lanes * 12) * (12 / inches)
        double weight = 0;
        double totalWeight = 0;
        int truckloads = 0; // Note: Use Math.ceil() after totalWeight / TRUCK_CAPACITY
        double tons = 0; // Note: totalWeight / 2000;
        double totalCost = 0; // Note: tons * ASPHALT_COST

        // Below this comment: collect the required inputs
        System.out.printf("%-33s: ","Enter length of road in miles");
        miles = in.nextDouble();
        System.out.printf("%-33s: ","Enter number of lanes");
        lanes = in.nextInt();
        System.out.printf("%-33s: ","Enter depth of asphalt in inches");
        inches = in.nextInt();
        
        // Below this comment: write Java code to do the computations needed to


        // determine the correct output

        // Below this comment: output the correct output

    }
}
