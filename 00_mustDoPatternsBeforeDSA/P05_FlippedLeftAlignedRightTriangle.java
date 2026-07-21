public class P05_FlippedLeftAlignedRightTriangle {
    public static void main(String[] args) {
        int size = 5;
        for (int i = size; i > 0; i--){
            for (int j = i; j > 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
