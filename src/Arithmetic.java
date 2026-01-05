public class Arithmetic {
    static void main() {
        int x = 5;
        int y = 10;
        int sum = x+y;
        int product = x * y;

        //double quotient = x / y; // this is still doing integer division
        double quotient = x / (double)y; //solve with casting
        System.out.println(quotient);
        int remainder = x % y; //use mod
        System.out.println(remainder);

        //increment variable++
        //decrement variable--
        //shorthands: +=. -=, *=, /=
    }
}
