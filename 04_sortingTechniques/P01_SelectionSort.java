public class P01_SelectionSort {
    public static void main(String[] args){
        int array[] = {12,324,123,5,4,123,1};
        int size = array.length;

        int minPos;
        // this loop maintains the position which is needed to be swapped
        for (int i = 0; i < size; i++){
            minPos = i;
            // this loop calculate the position of the minimum value in the remaining list
            for (int j = i; j < size; j++){
                if (array[minPos] > array[j]){
                    minPos = j;
                }
            }

            // swapping the boundry limit with the minimum position value
            int temp = array[minPos];
            array[minPos] = array[i];
            array[i] = temp;
        }

        for (int i : array){
            System.out.println(i);
        }
    }
}
