import java.util.ArrayList;
import java.util.Arrays;

public class P04_MergeSort {
    public static void main(String[] args) {
        int array[] = {3,2,8,5,1,4,23};
        int sortedArray[] = mergeSort(array);

        for (int x : sortedArray){
            System.out.println(x);
        }
    }

    public static int[] mergeSort(int[] array){
        int size = array.length;

        if (size <= 1){
            return array;
        }

        int middle = size / 2;

        int left[] = mergeSort(Arrays.copyOfRange(array, 0, middle));
        int right[] = mergeSort(Arrays.copyOfRange(array, (middle + 1), (size - 1)));

        ArrayList<Integer> sortedArray = new ArrayList<>();

        int leftSize = left.length;
        int rightSize = right.length;

        int i = 0;
        int j = 0;

        while ( i < leftSize || j < rightSize){
            
            if ( i == leftSize){
                sortedArray.add(right[j]);
                j++;
                continue;
            }
            else if (j == rightSize){
                sortedArray.add(left[i]);
                i++;
                continue;
            }

            int leftElement = left[i];
            int rightElement = right[j];

            if (leftElement > rightElement){
                sortedArray.add(rightElement);
                j++;
            }
            else {
                sortedArray.add(leftElement);
                i++;
            }
        }

        int[] returnArray = sortedArray.stream().mapToInt(Integer::intValue).toArray();

        return returnArray;
    }
}
