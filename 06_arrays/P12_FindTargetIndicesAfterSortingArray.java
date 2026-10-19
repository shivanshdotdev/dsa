import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class P12_FindTargetIndicesAfterSortingArray {
    public static void main(String[] args) {
        int[] nums = {1,2,5,2,3};
        int target = 2;

        int lessCount = 0;
        int equalCount = 0;

        for (int i : nums){
            if (i < target){
                lessCount++;
            }
            else if (i == target){
                equalCount++;
            }
        }

        List<Integer> list = new ArrayList<>();

        for (int i = lessCount; i <= equalCount; i++){
            list.add(i);
        }

        for (int i : list){
            System.out.println(i);
        }

    }
}
