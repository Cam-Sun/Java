package sessions;

import java.util.Scanner;

public class Sessions014_substrings {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your email address: ");
        String email = scanner.nextLine();
        if (email.contains("@")) {
            String name = email.substring(0, email.indexOf('@'));
            System.out.println("Your name is " + name);
            String domain = email.substring(email.indexOf('@') + 1, email.length());
            System.out.println("You domain is " + domain);
        } else {
            System.out.println("Email must contain @");
        }

    }
}
