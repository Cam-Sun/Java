package sessions;

import java.util.Scanner;

public class Sessions013_stringMethods {
    public static void main(String[] args) {
        String name = "Hello, Lulu";
        int length;
        int index;
        boolean isEmpty;
        String numString = "12345";

        length = name.length();
        index = name.indexOf("u");
        char letter = name.charAt(index);
        isEmpty = name.isEmpty();
        String replacedName = name.replace("u", "o");
        int lastIndex = name.lastIndexOf("u");


        System.out.println("Last index is" + lastIndex);
        System.out.println("The string length is: " + length);
        System.out.printf("The letter at index %d is %c \n", index, letter);
        System.out.println("Replaced name is " + replacedName);
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        char[] myArray = {'H', 'e', 'l', 'l', 'o'};
        numString.getChars(3, 5, myArray, 2);
        System.out.println(myArray);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter password: ");
        String password = scanner.nextLine();
        if (name.equalsIgnoreCase(password)) {
            System.out.println("Name can't be password");
        } else {
            System.out.println("Hello" + name);
        }

        scanner.close();
    }


}
