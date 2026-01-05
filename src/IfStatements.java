import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {
        int age = 19;
        if (age >= 21){
            System.out.println("Youre allowed to drink, but u shouldnt D:");
        }else if(age >= 19){
            System.out.println("u can vote!");
        }else{
            System.out.println("u cant do anything");
        }

        System.out.println("Please enter ur name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();


        //   if(name == "Klins"){ //String comparsions should not be done this way. this compares memory locations
        if(name.equalsIgnoreCase("Klins") ){

            System.out.println("You need a new job and a therapist, Bozo!");
        }else{
            System.out.println("keep on keepin on!");
        }
    }
}
 