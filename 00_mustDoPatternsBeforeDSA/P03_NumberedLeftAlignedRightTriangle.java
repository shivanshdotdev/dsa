public class P03_NumberedLeftAlignedRightTriangle {
    public static void main(String[] args) {
        int size = 5;
        
        //METHOD 1
        for (int i = 1; i <= size; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }


        // METHOD 2
        for(int i = 1; i <= size; i++){
            StringBuilder str = new StringBuilder();
            for (int j = 1; j <= i; j++){
                str.append(j);
            }
            System.out.println(str.toString());
        }
    }
}
