import java.util.HashSet;

public class P21_ContainsDuplicate_217 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        
        HashSet<Integer> hash = new HashSet<>();

        for (int i : nums){
            if (hash.contains(i)){
                System.out.println(true);
                return;
            }
            hash.add(i);
        }

        System.out.println(false);
    }
}
