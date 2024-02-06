import java.util.Scanner;
public class OutputNotation {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        double depth = scnr.nextDouble();
        char ticketLetter = scnr.next().charAt(0);

        System.out.printf("%.6e%%\n", depth);
        System.out.printf("%x%%\n", (int) ticketLetter);
        System.out.printf("%.6f%%\n", depth);

        scnr.close();
    }
}
