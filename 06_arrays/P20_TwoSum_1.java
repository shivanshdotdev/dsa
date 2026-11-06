import java.util.HashMap;

public class P20_TwoSum_1 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 6;

        int[] arr = new int[2];

        HashMap<Integer, Integer> hash = new HashMap<>();

        hash.put(nums[0], 0);

        for (int i = 1; i < nums.length; i++){
            int needed = target - nums[i];

            if (hash.containsKey(needed)){
                arr[0] = hash.get(needed);
                arr[1] = i;
                System.out.println(arr.toString());
            }

            else {
                hash.put(nums[i], i);
            }
        }
    }
}
