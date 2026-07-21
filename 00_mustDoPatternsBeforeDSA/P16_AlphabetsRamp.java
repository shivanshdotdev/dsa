public class P16_AlphabetsRamp {
    public static void main(String[] args) {
        int size = 5;

        // APPROACH 1 

        for (char i = 'A'; i < ('A' + size); i++){
            for (int j = 1;j <= (i - 'A' + 1); j++){
                System.out.print(i);
            }
            System.out.println();
        }

        // APPROACH 2

        for (int i = 1; i <= size; i++){
            for (int j = 1; j <= i; j++){
                System.out.print((char) ('A' + i - 1));
            }
            System.out.println();
        }
    }
}
