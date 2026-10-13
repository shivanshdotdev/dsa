public class P02_ShuffleTheArray_1470 {
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;

        int[] arr = new int[2 * n];

        int put = 0;
        for (int i = 0; i < n; i++){
            arr[put] = nums[i];
            put += 2;
        }

        put = 1;
        for (int i = n; i < 2*n; i++){
            arr[put] = nums[i];
            put += 2;
        }

        for (int i = 0; i < 2*n; i++){
            System.out.println(arr[i]);
        }
    }
}
