public class P14_IncreasingLettersRightTriangle {
    public static void main(String[] args) {
        int size = 5;

        for (int i = 1; i <= size; i++){
            for (char c = 'A'; c < ('A' + i); c++){
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
