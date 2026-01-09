import java.util.Random;
import java.util.Scanner;

public class DiceGamble {
    //write a program that
    //at the start of the program, show the user has $50
    //repeatedly ask the user how much they would like to wager and then roll a die
    //(random num 1-6)
    //to get the wager, pass in the users current balance. make sure they do not wager
    //more than they have, or a negative number
    // return the wager
    //if they roll an even number, they lose their wager, if its odd, they make the money
    //show the updated balance and repeat

    static void main() {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int balance = 50;
        System.out.println("you start with $" + balance);

        while (balance > 0) {
            int wager = getWager(scanner, balance);

            int roll = rand.nextInt(6) + 1;
            System.out.println("you rolled a " + roll);

            if (roll % 2 == 0) {
                balance -= wager;
                System.out.println("even roll! you lost $" + wager);
            } else {
                balance += wager;
                System.out.println("odd roll! you won $" + wager);
            }


        }
        System.out.println("you're out of money! GAME OVER");
        scanner.close();
    }

    public static int getWager(Scanner scanner, int balance) {
        int wager;

        while (true) {
            System.out.println("balance: $" + balance);
            System.out.print("enter your wager: ");
            wager = scanner.nextInt();

            if (wager > 0 && wager <= balance) {
                return wager;
            } else {
                System.out.println("invalid wager. wager between $1 and $" + balance);
            }
        }
    }
}
