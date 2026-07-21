public class P17_AlphabetPyramid {
    public static void main(String[] args) {
        int size = 5;

        for (int i = 1; i <= size; i++){
            for (int j = 1; j <= (size - i); j++){
                System.out.print(" ");
            }

            char peakCharacter = (char) ('A' + i - 1);
            for (char c = 'A'; c <= peakCharacter; c++){
                System.out.print(c);
            }

            for (char c = (char)(peakCharacter - 1); c >= 'A'; c--){
                System.out.print(c);
            }

            System.out.println();
        }
    }
}
