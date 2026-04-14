package sessions;

import java.util.Scanner;

public class Sessions005_arithmetic {
    public static void main(String[] args) {
        //Arithmetic Operators

        int x = 10;
        int y = 3;
        int z;
        z = x + y;
//        x += y;
//        x -= y;
//        x *= y;
        x /= y;

        // Increment and Decrement Operations
        x++;
        x++;
        x++;

        //ORDER OF OPERATIONS [PARENTHESES>EXPONENT>MULTIPLICATION>DIVISION>ADDITION>SUBTRACTION]
        System.out.println(x);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number here: ");
        double num1 = scanner.nextDouble();
        System.out.println("The 1st number is: " + num1 );
        System.out.print("\nPlease enter another number here: ");
        int num2 = scanner.nextInt();
        System.out.println("The 2nd number is: " + num2);

        scanner.close();
    }
}
