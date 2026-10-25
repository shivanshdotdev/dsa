public class P18_MajorityElement_169 {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        int n = nums.length;
        int majorityCount = n/2;

        //    ------------ 16ms -------------
        //
        // Map<Integer, Integer> hash = new HashMap<>();
        //
        // for (int i : nums){
        //     hash.put(i, hash.getOrDefault(i, 0) + 1);
        // }
        //
        // for (Map.Entry<Integer, Integer> i : hash.entrySet()){
        //     if (i.getValue() > majorityCount){
        //         System.out.println(i.getKey());
        //     }
        // }

        //    ------------ 7ms -------------
        //
        // Arrays.sort(nums);
        //
        // System.out.println(nums[majorityCount]);

        //              
    }
}
