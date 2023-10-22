import java.util.Scanner;

public class assignment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input two numbers from the user
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();
        
        // Calculate the GCD using the Euclidean algorithm
        int gcd = findGCD(number1, number2);
        
        // Display the GCD
        System.out.println("The GCD of " + number1 + " and " + number2 + " is: " + gcd);
        
        scanner.close();
    }
    
    // Function to find the GCD using the Euclidean algorithm
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
