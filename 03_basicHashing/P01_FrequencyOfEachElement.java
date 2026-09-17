import java.util.HashMap;

public class P01_FrequencyOfEachElement {
    public static void main(String[] args){
        int arr[] = {2,2,3,4,4,2};

        HashMap<Integer, Integer> hash = new HashMap<>();

        for (int key : arr){
            int frequency = hash.getOrDefault(key, 1);
            if (hash.containsKey(key)){
                frequency++;
            }
            hash.put(key, frequency);
        }

        for (int key : hash.keySet()){
            System.out.print(key + " ");
            System.out.println(hash.get(key));
        }
    }
}
