public class P10_FindPivotIndex_724 {
    public static void main(String[] args) {
        int[] nums = {2, 1, -1};
        int n = nums.length;

        int[] prefix = new int[n];
        boolean found = false;
        int idx = 0;

        prefix[0] = nums[0];
        for (int i = 1; i < n; i++){
            prefix[i] = prefix[i-1] + nums[i];
        }

        if (prefix[n-1] - prefix[0] == 0){
            System.out.println(0);
            return;
        }

        for (int i = 1; i < n; i++){
            if (prefix[i-1] == prefix[n-1] - prefix[i]){
                found = true;
                idx = i;
                break;
            }
        }

        if (found){
            System.out.println(idx);
        }
        else {
            System.out.println(-1);
        }
    }
}
