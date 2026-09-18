public class P02_BubbleSort { 
    public static void main(String[] args){
        int array[] = {13,46,24,52,20,9};
        int size = array.length;

        boolean swap = false;

        for (int j = 0; j < size; j++){
            for (int i = 0; i < size-1; i++){

                if (array[i] > array[i+1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    swap = true;
                }
            }

            if (swap == false){
                break;
            }

            swap = false;
        }

        for (int i : array){
            System.out.println(i);
        }
    }
}
