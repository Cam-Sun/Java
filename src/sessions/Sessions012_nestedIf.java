package sessions;

public class Sessions012_nestedIf {
    public static void main(String[] args){
        boolean isStudent = false;
        boolean isSenior = false;
        double price = 9.99;

        if(isStudent){
            if(isSenior){
                System.out.println("You get student 10% off");
                System.out.println("You get also a senior discount 20% off");
                price = price * 0.9 * 0.8;
                System.out.printf("The price is %.2f", price);
            } else{
                System.out.println("You only get student 10% off");
                price = price * 0.9;
                System.out.printf("The price is %.2f", price);
            }
        } else {
            if(isSenior){
                System.out.println("You only get senior discount 20% off");
                price = price * 0.8;
                System.out.printf("The price is %.2f", price);
            } else{
                System.out.println("No discount applied");
                System.out.printf("The price is %.2f", price);
            }
        }

    }
}
