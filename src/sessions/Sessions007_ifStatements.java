package sessions;

import java.util.Scanner;

public class Sessions007_ifStatements {
    public static void main(String[] args){

        boolean isRaining;
        Scanner scanner = new Scanner(System.in);

        char input;
        System.out.print("Is it raining now. Please enter y or n: ");
        input = scanner.nextLine().charAt(0); //if input is declared String no need to attached charAt here
        System.out.println(input);
        if(input == 'y' ){
            // if input is declared String type,then use input.equals("y")
            isRaining = true;
            System.out.println(isRaining);
        } else if(input == 'n'){
            isRaining = false;
            System.out.println(isRaining);
        } else System.out.println("NO match");

        scanner.close();

        /*
        char type is Primitive
        String type is Object
         */

    }

}
