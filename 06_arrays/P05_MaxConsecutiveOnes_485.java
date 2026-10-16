public class P05_MaxConsecutiveOnes_485 {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};

        int maxCount = 0;
        int count = 0;
        
        for (int i : nums){
            if (i == 1){
                count++;
                continue;
            }

            if (maxCount < count){
                maxCount = count;
            }

            count = 0;
        }

        if (maxCount < count){
            maxCount = count;
        }

        System.out.println(maxCount);
    }
}
