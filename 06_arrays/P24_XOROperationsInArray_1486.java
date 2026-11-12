public class P24_XOROperationsInArray_1486 {
    public static void main(String[] args){
        int n = 5;
        int start = 0;

        int[] arr = new int[n];
        
        int x = start;
        arr[0] = start;

        for (int i = 1; i < n; i++){
            arr[i] = start + (2 * i);
            x = x ^ arr[i];
        }

        for (int i : arr){
            System.out.print(i + " ");
        }

        System.out.println(x);
    }
}
