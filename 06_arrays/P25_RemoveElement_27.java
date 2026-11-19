public class P25_RemoveElement_27 {
    public static void main(String[] args){
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;

        int l = 0;
        int r = nums.length - 1;

        int count = 0;
        while (l < r){
            if (nums[r] == val){
                r--;
                continue;
            }

            if (nums[l] == val){
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                r--;
                count++;
            }

            l++;
        }

        for (int i : nums){
            System.out.println(i);
        }
    }
}
