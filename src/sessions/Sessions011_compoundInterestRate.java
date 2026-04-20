package sessions;

import java.util.Scanner;

public class Sessions011_compoundInterestRate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double principal;
        double rate;
        int timesCompound;
        int years;
        double amount;

        System.out.print("Please enter the principle amount:  ");
        principal = scanner.nextDouble();

        System.out.print("Please enter the interest rate:  ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Please enter the # of times compounded per year:  ");
        timesCompound = scanner.nextInt();

        System.out.print("Enter the # of years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate / timesCompound, timesCompound * years);
        System.out.printf("The amount after %d years is $%.2f", years, amount);

        scanner.close();

    }
}
