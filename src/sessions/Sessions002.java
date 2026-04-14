package sessions;

public class Sessions002 {
    public static void main(String[] args){
// variable = a reusable container for a value
//        a variable behaves as if it was the value it contains
// primitive = simple value stored directly in memory (stack)
// Reference = memory address (stack) that points to the (heap)
// primitive : int, double, clar, boolean
//Reference:string, array, object

     int age = 90;
     int year = 2025;

     double gpa = 3.5;
     double height = 165.5;
     double price = 9.4;
     char grade = 'A';
     char symbol = '!';
     char currency = '$';
     boolean isStudent = false;
     boolean isOnline = true;
     boolean isOnSale = false;

     String firstName = "Wawa";
     String lastName = "Kabuchoo";
     String favColour = "red";


     System.out.println(age);
     System.out.println("The year is " + year);
     System.out.println("$" + price);
        System.out.println(firstName + " " + lastName + "'s favourite colour is " + favColour + " in " + year);

        if(isOnline){
            System.out.println("You can purchase it online");
        } else {
            System.out.println("Please buy it from real store");
        }
      }
}
