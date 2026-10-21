public class P14_SearchInsertPosition_35 {
    public static void main(String[] args) {
        int[] nums = {
            1, 3, 5, 6
        };

        int target = 0;

        int n = nums.length;

        int l = 0;
        int r = n - 1;

        int mid = 0;

        while (l <= r){
            mid = (l + r) / 2;

            if (nums[mid] == target){
                System.out.println(mid);
                break;
            }
            else if (nums[mid] > target){
                r = mid - 1;
            }
            else {
                l = mid + 1;
            }
        }

        int val = nums[mid];

        if (val < target && mid < n - 1){
            System.out.println(mid + 1);
        }
        else if (val > target && mid > 0){
            System.out.println(mid - 1);
        }
        
    }
}
