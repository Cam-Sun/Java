package sessions;

public class Sessions010_printf {
    public static void main(String[] args) {

        String name = "Lili";
        char letter = 'l';
        int age = 5;
        double height = 1.22;
        boolean isStudent = false;

        System.out.printf("You name is %s\n", name);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("You name start with %c\n", letter);
        System.out.printf("You are %.2f cms tall\n", height);
        System.out.printf("%s is %d years old\n", name, age);
        System.out.printf("Is student: %b\n", isStudent);

        // + output a plus sign
        //comma grouping separator
        // ( = negative numbers are enclosed in ()
        // space  = display a minus if negative, space if positive
        double num1 = 8.99;
        double num2 = 100.1;
        double num3 = -0.2;

        System.out.printf("% .2f\n", num1);
        System.out.printf("% .2f\n", num2);
        System.out.printf("% .2f\n", num3);


        //0 between %d to add padding
        //number = right justified padding
        //negative number = left justified padding
        int int1 = 1;
        int int2 = 23;
        int int3 = 345;
        int int4 = 6789;

        System.out.printf("%4d\n", int1);
        System.out.printf("%4d\n", int2);
        System.out.printf("%-4d\n", int3);
        System.out.printf("%-4d\n", int4);


    }
}
