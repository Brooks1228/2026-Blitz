import java.util.Scanner;

public class WhileLoops {
    static void main() {
        //write a program that asks for input until real input is given (eg. not just enter)
        Scanner scanner = new Scanner(System.in);
        String name = "";

        while(name.isEmpty()){
            System.out.print("please enter your name -> ");
            name = scanner.nextLine().trim();
        }
        System.out.printf("hello %s\n", name);

        //an infinite loop
        String sonic = "bum";
        while(sonic.equals("bum")){
            System.out.printf("sonic is a %s\n", sonic);
        }

        int age;
        do{
            System.out.print("please enter an age -> ");
            age = scanner.nextInt();
            scanner.nextLine();
            if(age <0){
                System.out.println("age must be >= 0");
            }
        }while (age < 0);
    }
}
