// THE FIRST APPROACH IS EASY TO UNDERSTAND BUT SLOWER AND 2ND APPROACH IS FASTER BUT A BIT TRICKIER BUT ITS GREAT AS WELL

public class P06_RotateArray_189 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int n = nums.length;
        k = k % n;

        int[] ans = new int[n];

        for (int i = 0; i < n; i++){
            ans[(i+k) % n] = nums[i];
        }

        for (int i = 0; i < n; i++){
            nums[i] = ans[i];
        }

    }
}


// SECOND APPROACH
public class P06_RotateArray_189 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int n = nums.length;
        k = k % n;

        int l, r; // boundries 

        // REVERSING THE ENTIRE ARRAY -- these three loops can be in a function accpeting l, r and array but that can be done easily
        l = 0;
        r = n - 1;

        while (l < r){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }

        // REVERSING THE FIRST HALF 
        l = 0;
        r = k - 1;
        
        while (l < r){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }

        // REVERSING THE SECOND HALF
        l = k;
        r = n - 1;

        while (l < r){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }

        for (int i : nums){
            System.out.println(i);
        }

    }
}
