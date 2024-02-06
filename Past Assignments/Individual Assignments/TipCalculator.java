import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the check amount: ");
        double checkAmount = scanner.nextDouble();

        double tipPercentage = 0.10;
        double tipAmount = checkAmount * tipPercentage;
        double totalAmount = checkAmount + tipAmount;
        System.out.printf("Total with 10%% tip ($%.2f) is $%.2f%n", tipAmount, totalAmount);

        tipPercentage = 0.15;
        tipAmount = checkAmount * tipPercentage;
        totalAmount = checkAmount + tipAmount;
        System.out.printf("Total with 15%% tip ($%.2f) is $%.2f%n", tipAmount, totalAmount);

        tipPercentage = 0.20;
        tipAmount = checkAmount * tipPercentage;
        totalAmount = checkAmount + tipAmount;
        System.out.printf("Total with 20%% tip ($%.2f) is $%.2f%n", tipAmount, totalAmount);

        tipPercentage = 0.25;
        tipAmount = checkAmount * tipPercentage;
        totalAmount = checkAmount + tipAmount;
        System.out.printf("Total with 25%% tip ($%.2f) is $%.2f%n", tipAmount, totalAmount);

        tipPercentage = 0.30;
        tipAmount = checkAmount * tipPercentage;
        totalAmount = checkAmount + tipAmount;
        System.out.printf("Total with 30%% tip ($%.2f) is $%.2f%n", tipAmount, totalAmount);
    }
}