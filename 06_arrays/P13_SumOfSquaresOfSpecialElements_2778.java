public class P13_SumOfSquaresOfSpecialElements_2778 {
    public static void main(String[] args) {
        int[] nums = {2,7,1,19,18,3};

        int n = nums.length;

        int sum = 0;

        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                sum = sum + (nums[i - 1] * nums[i - 1]);
            }
        }

        System.out.println(sum);
    }
}
