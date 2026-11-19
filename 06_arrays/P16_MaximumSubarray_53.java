public class P16_MaximumSubarray_53 {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        int n = nums.length;
        int maxSum = nums[0];
        int sum = nums[0];

        for (int i = 1; i < n; i++){
            // the sum from the previous subarray is being stored in the sum 
            // the impact of the current/new element on the sum is being stored in the chk variable 
            int chk = sum + nums[i];

            // now the decision we have to take is either consider or add the current element in the subarray 
            // or drop the ongoing subarray and start the new subarray from the current element 
            
            // that decision depends on whether the sum (after the impact) is more or less than the current element 
            // the current element may have degraded the previous sum but it may still be more than the current element 
            // hence starting the new subarray is a loss and hence previous subarray will be continued

            // the sum after the impact maybe less than the current element 
            // hence dropping the prev subarray sum is the better decision and start from the current element 
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
