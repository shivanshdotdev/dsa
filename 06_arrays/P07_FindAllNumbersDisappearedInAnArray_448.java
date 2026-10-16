import java.util.ArrayList;
import java.util.List;

public class P07_FindAllNumbersDisappearedInAnArray_448 {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        int n = nums.length;

        for (int i = 0; i < n; i++){
            int x = nums[i];

            if (x < 0){
                x *= -1;
            }

            if (nums[x - 1] > 0){
                nums[x - 1] *= -1;
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++){
            if(nums[i] > 0){
                list.add(i+1);
            }
        }

        for (int i : list){
            System.out.println(i);
        }



    }
}
