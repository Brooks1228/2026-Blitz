import java.util.Random;

public class methods {
    //DRY principle - dont repeat yourself
    static void main() {

    }

    /**
     * a function that says happy birthday
     * @param age
     * @param name
     */
    public static void happyBirthday(int age, String name){
        System.out.printf("happy birthday %s, you are now %d years old\n", name, age);
    }

    //method that returns a value
    public static String getRandomAdjective(){
        Random random = new Random();
        int num = random.nextInt(10);
        switch(num){
            case 1,2 -> {return "goofing off";}
            case 3,4 -> {return "sleeping";}
            case 5,6 -> {return "doing their work";}
            case 7,8 -> {return "dancing";}
            case 9,0 -> {return "wondering why mr klins is still teaching";}
            default -> {return "no one knows";}
        }
    }

    //write a program that
    //at the start of the program, show the user has $50
    //repeatedly ask the user how much they would like to wager and then roll a dice
    //(random num 1-6)
        //to get the wager, pass in the users current balance. make sure they do not wager
        //more than they have, or a negartive number
        // return the wager
    //if they roll an even number, they lose their wager, if its odd, they make the money
    //show the updated balance and repeat
}
