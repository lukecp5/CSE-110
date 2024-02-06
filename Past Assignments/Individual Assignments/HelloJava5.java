import java.util.Scanner;

public class HelloJava5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter some text: ");
        String inputText = scanner.nextLine();
        
        System.out.println("The input text is: " + inputText);
    }
}