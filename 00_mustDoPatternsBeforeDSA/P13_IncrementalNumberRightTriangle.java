public class P13_IncrementalNumberRightTriangle {
    public static void main(String[] args) {
        int size = 5;
        int number = 1;

        for (int i = 1; i <= size; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(number);
                System.out.print(" ");
                number++;
                // THE ABOVE 3 LINES can be collapsed into one due to postfix and string concatenation
                // System.out.print(number++ + " ");
            }
            System.out.println();
        }
    }
}
