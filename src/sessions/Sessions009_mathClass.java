package sessions;

import java.util.Scanner;

public class Sessions009_mathClass {
    public static void main(String[] args) {
        double result = Math.abs(-2);
        result = Math.pow(2, 4);
        result = Math.ceil(3.2);
        result = Math.round(3.2);
        result = Math.min(1, 4);
        System.out.println(result);

        double radius;
        double circumference;
        double area;
        double volume;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter radius: ");
        radius = scanner.nextDouble();
        System.out.println("The radius is:" + radius + " cm");

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 2.0) * Math.PI * Math.pow(radius, 3);
        System.out.println("The circumference is: " + circumference + "cm");
        System.out.println("The area is " + area + "cm²");
        System.out.println("The volume is " + volume + "cm³");
    }
}
