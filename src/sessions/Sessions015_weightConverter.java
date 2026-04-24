package sessions;

import java.util.Scanner;

public class Sessions015_weightConverter {
    public static void main(String[] args) {
//weight conversion program

        //Declare Variable
        Scanner scanner = new Scanner(System.in);
        double weight;
        double newWeight;
        int option;

        //Weclome Message
        System.out.println("Welcome");
        System.out.println("Option 1: convert lbs to kg");
        System.out.println("Option 2: convert kg to lbs");
        System.out.print("Please enter the option number: ");

        //Option 1 convert lbs to kg

        //Option 2 convert kg to lbs

        option = scanner.nextInt();
        if (option == 1) {
            System.out.println("Please enter weight in lbs:");
            weight = scanner.nextDouble();
            ;
            newWeight = weight * 0.453592;
            System.out.printf("The new weight is %.2f", newWeight);
        } else if (option == 2) {
            System.out.print("Please enter weight in kgs:");
            weight = scanner.nextDouble();
            newWeight = weight * 2.24062;
            System.out.printf("The new weight is %.2f", newWeight);
        } else {
            System.out.println("No valid option");
        }
        //else print not a valid choice


        scanner.close();
    }
}
