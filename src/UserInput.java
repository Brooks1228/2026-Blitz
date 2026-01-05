// to get user input, you need to input a scanner
import java.util.Scanner; //this is needed for input
public class UserInput {
    static void main() {
        //create a scanner object:
        Scanner myscanner = new Scanner(System.in); //scan the console
        System.out.println("please enter your name -> ");

        //read in a string:
        String name = myscanner.nextLine();
        System.out.printf("Hello %s", name);

        //next vs nextline:
        //next - reads just to the next space
        //nextline - reads to the end of a line

        System.out.printf("Hello %s", name);
        System.out.print("please enter your middle and last name -> ");
        String nextName = myscanner.next();
        System.out.printf("nextName = %s\n", nextName);
        myscanner.nextLine();
        System.out.print("please enter your age: ");
        int age = myscanner.nextInt();

        //common error
        // when you use scanner.next(), scanner.nextInt(), or .nextDouble()
        //  it will read in the token (number or whatever), and leave the cursor
        //  after it. this often means there is a \n that still needs consumed on the line
        // eg. if the line was 6\n
        // scanner.nextInt() will read in the 6 and pointer will be pointing at "\n"
        // So the next time you call nextLine(), it reads in only tje \n

        //common fix: add a nextLine() after any nextInt() calls
        System.out.println("who is your favorite artist? ");
        String artist = myscanner.nextLine();
        System.out.println(artist);

        myscanner.close(); //close scanners when you are done with them
    }
}
