public class P03_RemoveDuplicatesFromSortedArray_26 {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        int pos = 1;
        for (int i = 1; i < nums.length; i++){
            if (nums[i] != nums[i-1]){
                nums[pos++] = nums[i];
            }
        }

        for (int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
    }
}
