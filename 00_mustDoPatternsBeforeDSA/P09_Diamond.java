public class P09_Diamond {
    
    public static void main(String[] args) {
        int size = 5;

        // normal pyramid
        for (int i = 1; i <= size; i++){
            for (int j = 1; j <= (size - i); j++){
                System.out.print(" ");
            }

            for (int j = 1; j <= ((i * 2) - 1); j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // flipped pyramid
        for (int i = size; i > 0; i--){
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
