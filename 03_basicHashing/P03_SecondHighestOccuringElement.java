import java.util.HashMap;

public class P03_SecondHighestOccuringElement {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1000,100,10};

        HashMap<Integer, Integer> hash = new HashMap<>();

        for (int i : nums){
            hash.put(i, hash.getOrDefault(i, 0)+1);
        }

        int largest = -1;
        int secondLargest = -1;

        int occuranceOfLargest = 0;
        int occuranceOfSecondLargest = 0;
        
        for (int i : hash.keySet()){
            int currentFreq = hash.get(i);

            if (currentFreq > occuranceOfLargest){
                secondLargest = largest;
                occuranceOfSecondLargest = occuranceOfLargest;
                largest = i;
                occuranceOfLargest = hash.get(i);
            }
            else if (currentFreq > occuranceOfSecondLargest && currentFreq < occuranceOfLargest){
                secondLargest = i;
                occuranceOfSecondLargest = hash.get(i);
            }
        }

        for (int i : hash.keySet()){
            System.out.println(i + " - " + hash.get(i));
        }
        System.out.println("-------------------------");

        System.out.println(secondLargest);

    }
}
