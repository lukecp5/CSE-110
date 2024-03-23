import java.util.Scanner;

public class Asphalt {
    public static void main(String[] args) {
        // Instantiating the scanner
        Scanner in = new Scanner(System.in);

        // Constant Variables
        double ASPHALT_WEIGHT = 145;
        double LOAD_COST = 750.00;
        double TRUCK_CAPACITY = 10000.00; // 5 tons of asphalt
        
        // Input variables
        double miles = 0;
        int lanes = 0;
        int inches = 0;

        // Computational & Output variables
        double cubicFeet = 0; // Note: (Miles * 5280) * (lanes * 12) * (inches / 12)
        double totalWeight = 0;
        int truckloads = 0; // Note: Use Math.ceil() after totalWeight / TRUCK_CAPACITY
        double totalCost = 0; // Note: tons * ASPHALT_COST || ASPHALT_COST * (truckloads * 750)

        // Collect inputs and prompt users  
        System.out.printf("%-33s: ", "Enter length of road in miles");
        miles = in.nextDouble();
        System.out.printf("%-33s: ", "Enter number of lanes");
        lanes = in.nextInt();
        System.out.printf("%-33s: ", "Enter depth of asphalt in inches");
        inches = in.nextInt();
        System.out.println("");


        // Computations/Processing expressions
        cubicFeet = (miles * 5280.00) * (lanes * 12.00) * (inches / 12.00);
        totalWeight = (cubicFeet * ASPHALT_WEIGHT);
        truckloads = (int)Math.ceil(totalWeight / TRUCK_CAPACITY); 
        totalCost = truckloads * LOAD_COST; // 5 Tons means $750.00 per truckload

        // Display results
        System.out.printf("%-33s: %d\n", "Truckloads of asphalt needed is", truckloads);   
        System.out.printf("%-33s: $%.2f\n", "Total cost of asphalt is", totalCost);   
        in.close();
    }
}
