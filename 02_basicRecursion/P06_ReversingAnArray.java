public class P06_ReversingAnArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int size = array.length;

        // because array is a reference type, its reference will be passed hence no need to get the return as the actual array is being modified in-place
        reverseArray(array, size, 0);

        for (int i : array) System.out.print(i + " ");
        System.out.println(); // to remove the endline(%) character
    }

    public static void reverseArray(int[] arr, int size, int swap){
        // move to the half of the arry for swapping 
        // for even size array, lets say 8, the swapping will happen as 0-7, 1-6, 2-5, 3-4 and that's it 
        // for odd size array, lets say 5, the swapping will happen as 0-4, 1-3 and the 2 is in centre which will be skipped
        
        // only swapping till half as if do not 
        // the entire arr will just restored into the original form and not reversed 
        if (swap >= size/2){
            return;
        }

        int swapWith = size - swap - 1;
        int temp = arr[swap];
        arr[swap] = arr[swapWith];
        arr[swapWith] = temp;

        reverseArray(arr, size, swap + 1);
    }
}
