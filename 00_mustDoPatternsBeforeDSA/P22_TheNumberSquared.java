public class P22_TheNumberSquared {
    public static void main(String[] args) {
        int size = 4;

        int gridSize = (size * 2) - 1;

        for (int i = 0; i < gridSize; i++){
            for (int j = 0; j < gridSize; j++){
                int top = i;
                int left = j;
                int bottom = gridSize - i - 1;
                int right = gridSize - j - 1;

                int minDistance = Math.min(Math.min(top, bottom), Math.min(left, right));

                System.out.print(size - minDistance);
            }
            System.out.println();
        }
    }
}
