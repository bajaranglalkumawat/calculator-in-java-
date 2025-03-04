import java.util.Scanner; 

public class calculator { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Welcome to the program");  

        System.out.println("Enter the mode of operation: 1. Addition 2. Subtraction 3. Multiplication 4. Division");
        System.out.print("Enter your choice: "); 
        int mode = sc.nextInt();  // Read user input

        System.out.print("Enter the first number: "); 
        int a = sc.nextInt(); 
        System.out.print("Enter the second number: "); 
        int b = sc.nextInt(); 

        // Perform operations based on mode selection
        if (mode == 1) { 
            System.out.println("Sum of a + b is: " + (a + b));
        } else if (mode == 2) { 
            System.out.println("Difference of a - b is: " + (a - b));
        } else if (mode == 3) { 
            System.out.println("Product of a * b is: " + (a * b));
        } else if (mode == 4) { 
            if (b != 0) {
                System.out.println("Division of a / b is: " + (a / (double)b));
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
        } else {
            System.out.println("Invalid choice! Please enter a number between 1 and 4.");
        }

        sc.close();  // Close the scanner to prevent memory leaks
    }
}
