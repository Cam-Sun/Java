package sessions;

import java.util.Scanner;

public class Sessions006_shoppingCartProgram {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double price;
        int quantity;
        char currency = '£';
        String item = "apple";
        double total;

        System.out.print("What is the price for each?: " );
        price = scanner.nextDouble();
        System.out.println("The price is: " + price);
        System.out.print("How many would you like?: ");
        quantity = scanner.nextInt();

        total = price * quantity;
        System.out.println("\nYou have bought " + quantity + " " + item + "/s");
        System.out.println("The total amount is " + currency + total);
        scanner.close();


    }
}
