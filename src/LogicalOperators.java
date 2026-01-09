//terminology - logical operators - and (&&), or (||) not (!)

public class LogicalOperators {

    static void main() {
        int temp = 40;
        boolean sunny = false;
        if (temp >= 0 && temp <= 30) {
            System.out.println("if this is celcius, which it should be, thats not bad");
        }else{
            System.out.println("HMMMMMMMMMMMM");
        }

        if(temp >= 0 && temp <= 30 && sunny){
            System.out.println("its good!");
        }else{
            System.out.println("meh. something isnt right");
        }

        // not not not not not - !!!!!!!!!!!
        if(!sunny){
            System.out.println("its not sunny out");
        }else{
            System.out.println("its sunny");
        }

        // lets talk about OR ||
        if(temp < 0 || temp > 30){
            System.out.println("the weather is not great");
        }

        // give me the code to evaluate a password and make sure its >4 characters, but less than 12
        // if its too long or too short, report invalid password. else report - it works!
        String password = "mr klins computer programming";
        int length = password.length();
        if (length > 4 && length < 12) {
            System.out.println("it works!");
        } else {
            System.out.println("invalid password");
        }
    }
}
