import java.util.HashMap;

public class P02_HighestAndLowestFrequency {
    public static void main(String[] args){
        int[] array = {2,2,3,4,4,2};
    
        HashMap<Integer, Integer> hashed = new HashMap<>();

        for (int key : array){
            hashed.put(key, hashed.getOrDefault(key, 0) + 1);
        }

        int highest = array[0];
        int lowest = array[0];

        for (int key : hashed.keySet()){
            int frequency = hashed.get(key);
            if (hashed.get(highest) < frequency){
                highest = key;
            }
            else if (hashed.get(lowest) > frequency){
                lowest = key;
            }
        }

        System.out.println("Highest: " + highest);
        System.out.println("Lowest: " + lowest);
    }
}
