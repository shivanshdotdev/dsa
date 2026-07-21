public class P12_NumberCrownPattern {
    public static void main(String[] args) {
        int size = 5;

        // the number of spaces in the first row/line is 6 for 4 and 8 for 5 and so on.
        // then every new row, the number of spaces decreases by 2 which is done at the end
        int spaces = (size - 1) * 2;
        for (int i = 1; i <= size; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }

            for (int s = 1; s <= spaces; s++){
                System.out.print(" ");
            }

            for (int j = i; j > 0; j--){
                System.out.print(j);
            }
            System.out.println();
            // every iteration, decreasing the spaces count by 2
            spaces -= 2;
        }
    }
}
