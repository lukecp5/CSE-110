import java.util.Scanner;

public class HelloJava3 {
   public static void main(String[] args) {
      // Below this comment: declare and instantiate a Scanner
      @SuppressWarnings("resource")
      Scanner input = new Scanner(System.in);

      // Below this comment: declare any variables you may need
      String name;
      // String message = "Enter your first name : ";
      // String reply = "Hello ";
      // Below this comment: collect the required inputs
      System.out.println("Enter your first name: ");
      name = input.next();

      // Below this comment: output the correct output
      System.out.print("Hello " + name);
   }
}