import java.util.ArrayList;
import java.util.List;

public class P07_FindAllNumbersDisappearedInAnArray_448 {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        int n = nums.length;

        for (int i = 0; i < n; i++){
            int x = nums[i]; // get the number at index 

            if (x < 0){ // convert that number to actual needed incase that number is already marked 
                x *= -1;
            }

            if (nums[x - 1] > 0){ // mark the number in the above number's position as negative 
                nums[x - 1] *= -1;
            }

        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++){
            if(nums[i] > 0){
                list.add(i+1); // now whatever the numbers that are not marked negative, there position + 1 number is missing 
                               // if they are not missing, that number - 1's position would have been marked negative in the above loop
            }
        }

        for (int i : list){
            System.out.println(i);
        }



    }
}
