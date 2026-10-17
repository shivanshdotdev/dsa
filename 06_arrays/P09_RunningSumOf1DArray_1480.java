public class P09_RunningSumOf1DArray_1480 {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 10, 1};
        int n = nums.length;

        int[] ans = new int[n];

        ans[0] = nums[0];
        for (int i = 1; i < n; i++){
            ans[i] = ans[i-1] + nums[i];
        }

        for (int i : ans){
            System.out.println(i);
        }
    }
}
