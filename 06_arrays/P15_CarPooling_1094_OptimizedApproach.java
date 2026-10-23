import java.util.Map;
import java.util.TreeMap;

public class P15_CarPooling_1094_OptimizedApproach {
    public static void main(String[] args) {
        // int[][] trips = {
        //     {2, 1, 5},
        //     {3, 3, 7}
        // };

        int[][] trips = {
            {4, 5, 6},
            {6, 4, 7},
            {4, 3, 5},
            {2, 3, 5}
        };

        int capacity = 13;

        Map<Integer, Integer> map = new TreeMap<>();
        
        for (int[] i : trips){
            map.put(i[1], map.getOrDefault(i[1], 0) + i[0]);
            map.put(i[2], map.getOrDefault(i[2], 0) - i[0]);
        }

        int maxCapacity = capacity;

        boolean breakOutNeeded = false;

        for (int i : map.values()){

            capacity = capacity - i;

            if (capacity < 0 || capacity > maxCapacity){
                breakOutNeeded = true;
                break;
            }
        }

        System.out.println(!breakOutNeeded);
    }
}
