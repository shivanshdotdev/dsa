public class P18_ReverseAlphabetRightTriangle {
    public static void main(String[] args) {
        int size = 6;

        char starter = (char)('A' + size - 1);

        for (int i = 1; i <= size; i++){
            for (char c = (char)(starter - i + 1); c <= starter; c++){
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
