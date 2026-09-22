import java.util.HashMap;

public class P03_SecondHighestOccuringElement {
    public static void main(String[] args) {
        int[] arr = {4, 4, 5, 5, 6, 7};

        HashMap<Integer, Integer> hash = new HashMap<>();

        for (int i : arr){
            hash.put(i, hash.getOrDefault(i, 0)+1);
        }

        int largest = arr[0];
        int secondLargest = arr[0];

        int occuranceOfLargest = hash.get(largest);
        int occuranceOfSecondLargest = hash.get(secondLargest);

        for (int i : hash.keySet()){
            if (hash.get(i) > occuranceOfLargest){
                secondLargest = largest;
                occuranceOfSecondLargest = occuranceOfLargest;
                largest = i;
                occuranceOfLargest = hash.get(i);
                continue;
            }
        }

    }
}
