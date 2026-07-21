public class P20_Butterfly {
    public static void main(String[] args) {
        int size = 5;

        for (int i = 1; i <= size; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }

            for (int j = 1; j <= (2 * (size - i)); j++){
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = (size - 1); i > 0; i--){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }

            for (int j = 1; j <= (2 * (size - i)); j++){
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
