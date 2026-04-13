import java.sql.SQLOutput;
import java.util.Scanner;

public class Sessions003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter your name: ");
//        String name = scanner.nextLine();
//        //String name = scanner.next();
//
//        System.out.print("Enter your age: ");
//        int age = scanner.nextInt();
//
//        System.out.print("What is your gpa: ");
//        double gpa = scanner.nextDouble();
//
//        System.out.print("Are you a student?(true/false): ");
//        boolean isStudent = scanner.nextBoolean();
//
//        System.out.println("Hello " + name);
//        System.out.println("You are " + age + " years old");
//        System.out.println("Your gpa is " + gpa);
//        if(isStudent){
//            System.out.println("You are enrolled as a student");
//        }else{
//            System.out.println("You are Not enrolled");
//        }

        //COMMON ISSUES
        // print("hello") — prints at cursor, cursor stays on the same line
        // println("hello") — prints at cursor, cursor moves to the next line

//        System.out.print("Enter your age: ");
//        int age = scanner.nextInt();
        //without below line,

//      scanner.nextLine();
        System.out.print("Enter your favourite colour: ");
        String color = scanner.nextLine();
        System.out.println("The color is " + color);
//
//        System.out.println("You are " + age + " years old");
//        System.out.println("You like the color  " + color);
        System.out.println("The surface is 100 " + "m²");

        scanner.close();
    }
}
