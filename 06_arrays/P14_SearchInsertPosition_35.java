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

        int ans = -1;

        while (l <= r){
            mid = (l + r) / 2;

            if (nums[mid] == target){
                ans = mid;
                break;
            }
            else if (nums[mid] > target){
                r = mid - 1;
            }
            else {
                l = mid + 1;
            }
        }

        if (ans != -1){
            System.out.println(ans);
        }
        else if (nums[mid] <= target){
            System.out.println(mid + 1);
        }
        else {
            if (mid > 0){
                System.out.println(mid - 1);
            }
            else {
                System.out.println(0);
            }
        }
    }
}
