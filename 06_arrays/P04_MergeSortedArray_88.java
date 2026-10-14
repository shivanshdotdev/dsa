public class P04_MergeSortedArray_88 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;

        int[] nums2 = {2, 5, 6};
        int n = 3;

        int temp[] = new int[m];
        for (int i = 0; i < m; i++){
            temp[i] = nums1[i];
        }

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < m && j < n){
            if (temp[i] < nums2[j]){
                nums1[k] = temp[i];
                k++;
                i++;
            }
            else{
                nums1[k] = nums2[j];
                k++;
                j++;
            }
        }

        while (i < m){
            nums1[k] = temp[i];
            i++;
            k++;
        }

        while (j < n){
            nums1[k] = nums2[j];
            j++;
            k++;
        }

        for (int p = 0; p < nums1.length; p++){
            System.out.println(nums1[p]);
        }
    }
}
