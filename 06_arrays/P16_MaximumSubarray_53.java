public class P16_MaximumSubarray_53 {
    public static void main(String[] args) {
        int[] nums = {-2, 1};

        int n = nums.length;
        int maxSum = nums[0];
        int sum = nums[0];

        for (int i = 1; i < n; i++){
            int chk = sum + nums[i];

            if (chk > nums[i]){
                sum = chk;
            }
            else {
                sum = nums[i];
            }

            if (sum > maxSum){
                maxSum = sum;
            }
        }
        System.out.println(maxSum);
    }
}
