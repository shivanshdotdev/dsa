public class P10_HalfDiamond {
    public static void main(String[] args) {
        int size = 5;

        // normal right triangle
        for (int i = 1; i <= size; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // flipped right triangle
        for (int i = 1; i <= (size - 1); i++){
            for (int j = 1; j <= (size - i); j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
