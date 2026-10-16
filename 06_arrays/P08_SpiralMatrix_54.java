public class P08_SpiralMatrix_54 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int m = matrix.length;
        int n = matrix[0].length;

        int[][] decision = new int[m][n];

        // DIRECTIONS 
        // right - 1
        // down - 2 
        // left - 3
        // up - 4

        int direction = 1;

        int i = 0;
        int j = 0;

        while (true){
            if (decision[i][j] == 0){
                System.out.println(matrix[i][j]);
                decision[i][j] = 1;
            }
            // else {
            //     direction = (direction % 4) + 1;
            // }

            switch (direction) {
                case 1: // looking or moving towards right

                    j++;
                    if (j >= n){
                        j--;
                        direction = 2;
                        continue;
                    }

                    break;

                case 2: // moving down

                    i++;
                    if (i >= m){
                        i--;
                        direction = 3;
                        continue;
                    }

                    break;

                case 3: // moving left

                    j--;
                    if (j < 0){
                        j++;
                        direction = 4;
                    }

                    break;

                case 4: // moving up

                    i--;
                    if (i < 0){
                        i++;
                        direction = 1;
                    }
                    break;
            
                default:
                    break;
            }
        }


    }
}
