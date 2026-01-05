import java.util.Random;

public class RandomNums {
    static void main() {
        //get a random object
        Random random = new Random();
        int randNum = random.nextInt(); //this can give very big and small nums
        System.out.println(randNum);
        int randNum2 = random.nextInt(6);
        System.out.println(randNum2);
    }
}
