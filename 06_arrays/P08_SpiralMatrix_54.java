
public class P08_SpiralMatrix_54 {
    public static void main(String[] args) {
        // int[][] matrix = {
        //     {1, 2, 3},
        //     {4, 5, 6},
        //     {7, 8, 9},
        // };

        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        // int[][] matrix = {
        //     {1,   2,   3,   4,   5,   6,   7,   8,   9,  10,  11,  12},
        //     {13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24},
        //     {25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36},
        //     {37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48},
        //     {49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60},
        //     {61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72},
        //     {73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84},
        //     {85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96},
        //     {97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108},
        //     {109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120}
        // };

        int m = matrix.length;
        int n = matrix[0].length;
        int total = m * n;

        int[][] decision = new int[m][n];

        // DIRECTIONS 
        // right - 1
        // down - 2 
        // left - 3
        // up - 4

        int direction = 1;

        int r = 0;
        int c = 0;
        int count = 0;
        int check;

        while (true){

            if (decision[r][c] == 0){
                System.out.println(matrix[r][c]);
                decision[r][c] = 1;
                count++;
                if (count >= total){
                    break;
                }
            }

            switch (direction) {

                case 1: // moving right

                    check = c + 1;
                    if (check >= n){
                        direction = 2;
                        break;
                    }

                    if (decision[r][check] == 1){
                        direction = 2;
                        break;
                    }

                    c++;

                    break;

                case 2: // moving down

                    check = r + 1;
                    if (check >= m){
                        direction = 3;
                        break;
                    }

                    if (decision[check][c] == 1){
                        direction = 3;
                        break;
                    }

                    r++;

                    break;

                case 3: // moving left

                    check = c - 1;
                    if (check < 0){
                        direction = 4;
                        break;
                    }

                    if (decision[r][check] == 1){
                        direction = 4;
                        break;
                    }

                    c--;

                    break;

                case 4: // moving up

                    check = r - 1;
                    if (check < 0){
                        direction = 1;
                        break;
                    }

                    if (decision[check][c] == 1){
                        direction = 1;
                        break;
                    }

                    r--;

                    break;

                default:
                    break;
            }
        }
    }
}
