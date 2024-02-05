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
        double totalWeight = 0;
        double tons = 0; // Note: totalWeight / 2000;
        int truckloads = 0; // Note: Use Math.ceil() after totalWeight / TRUCK_CAPACITY
        double totalCost = 0; // Note: tons * ASPHALT_COST || ASPHALT_COST * (truckloads * 750)
        double finalTotal = 0; // ASPHALT_COST * (truckloads * 750)

        // Below this comment: collect the required inputs
        System.out.printf("%-33s: ", "Enter length of road in miles");
        miles = in.nextDouble();
        System.out.printf("%-33s: ", "Enter number of lanes");
        lanes = in.nextInt();
        System.out.printf("%-33s: ", "Enter depth of asphalt in inches");
        inches = in.nextInt();
        System.out.println("");

        // Computations/Processing expressions
        cubicFeet = (miles * 5280.00) * ((double)lanes * 12.00) * (inches / 12.00);
        totalWeight = (cubicFeet * ASPHALT_WEIGHT);
        tons = (totalWeight / (double)2000);
        truckloads = (int)Math.ceil(totalWeight / (double)10000.00); // Note: Output to console
        totalCost = truckloads * 750.00; // Note: Output to console


        // finalTotal = truckloads * 750.00;
        // System.out.printf("\n\nTotal Cost: %f\n\n\n", finalTotal);

        // Display results
        System.out.printf("%-33s: %d\n", "Truckloads of asphalt needed is", truckloads);   
        System.out.printf("%-33s: $%.2f\n", "Total cost of asphalt is", totalCost);   

    }
}
