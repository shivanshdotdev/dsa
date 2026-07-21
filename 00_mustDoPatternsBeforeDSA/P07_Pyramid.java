public class P07_Pyramid {
    public static void main(String[] args) {
        int size = 5;

        for (int i = 1; i <= size; i++){
            for (int j = 1; j <= (size - i); j++){
                System.out.print(" ");
            }

            for (int j = 1; j <= ((i * 2) - 1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
