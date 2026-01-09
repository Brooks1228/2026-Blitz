public class NestedLoops {
    //nested loops - a loop inside of a loop
    static void main() {
        //build a board!
        for(int i = 0; i < 10; i++){
            //nested
            for(int j = 0; j < 10; j++){
                //print coordinates
                System.out.printf("(%d,%d) ", i, j);
            }
            System.out.println();
        }
    }
}
