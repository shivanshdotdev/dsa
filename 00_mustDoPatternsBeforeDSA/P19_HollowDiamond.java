public class P19_HollowDiamond {
    public static void main(String[] args) {
        int size = 5;

        for (int i = 1; i <= size; i++){
            for (int j = 1; j <= (size - i + 1); j++){
                System.out.print("*");
            }

            // you can write the condition by taking common as wel 
            // (2 * (i - 1))
            for (int j = 1; j <= (i * 2 - 2); j++){
                System.out.print(" ");
            }

            for (int j = 1; j <= (size - i + 1); j++){
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = 1; i <= size; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }

            // (2 * (size - i))
            for (int j = 1; j <= ((size * 2) - (i * 2)); j++){
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
