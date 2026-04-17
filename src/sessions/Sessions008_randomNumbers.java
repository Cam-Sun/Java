package sessions;

import java.util.Random;

public class Sessions008_randomNumbers {
    public static void main(String[] args) {

        Random random = new Random();
        int number;
        int number1;
        double number2;
        number = random.nextInt(0, 8);
        number1 = random.nextInt(0, 7);
        number2 = random.nextInt(0, 7);
        System.out.println(number);
        System.out.println(number1);
        System.out.println(number2);

        boolean isHeads;
        isHeads = random.nextBoolean();
        if (isHeads) {
            System.out.println("Heads");
        } else {
            System.out.println("Tails");
        }

    }
}
