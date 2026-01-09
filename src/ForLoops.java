public class ForLoops {
    static void main() {
        /*
        *syntax: for(initialization;condition;update)
         */
        for(int i=0; i<50; i++){
            System.out.printf("%d: uhgurarno\n", i);
        }

        //break and continue
        for(int i=0; i < 25; i++){
            //skip 13
            if (i == 13){
                continue; //advances back to the top of the loop
            }
            //stop at 20
            if(i==20){
                break; //exits the loop
            }
            System.out.println(i);
        }
    }
}
