public class P15_FlippedLettersRightTriangle {
    public static void main(String[] args) {
        int size = 5;

        for (int i = size; i > 0; i--){
            for (char c = 'A'; c < ('A' + i); c++){
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
