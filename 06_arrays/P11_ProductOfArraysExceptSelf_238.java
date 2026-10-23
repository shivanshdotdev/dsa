// THE ABOVE APPROACH IS TIME O(N) AND SPACE O(N) [O(2N) as the left products and right products for each index is stored] 
// THE SECOND APPROACH IS TIME O(N) [two traversals] AND SPACE O(1) as the left products are stored in the ans or output array itself and right products are maintained in a variable 

public class P11_ProductOfArraysExceptSelf_238 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int n = nums.length;

        int[] leftElementsProduct = new int[n];
        int[] rightElementsProduct = new int[n];

        leftElementsProduct[0] = 1;
        for (int i = 1; i < n; i++){
            leftElementsProduct[i] = leftElementsProduct[i - 1] * nums[i - 1];
        }

        rightElementsProduct[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--){
            rightElementsProduct[i] = rightElementsProduct[i + 1] * nums[i + 1];
        }

        for (int i : leftElementsProduct){
            System.out.println(i);
        }

        System.out.println("-------------------");

        for (int i : rightElementsProduct){
            System.out.println(i);
        }

        int[] ans = new int[n];

        for (int i = 0; i < n; i++){
            ans[i] = leftElementsProduct[i] * rightElementsProduct[i];
        }

        for (int i : ans){
            System.out.println(i);
        }
    }
}

// public class P11_ProductOfArraysExceptSelf_238 {
//     public static void main(String[] args) {
//         int[] nums = {1, 2, 3, 4};
//         int n = nums.length;
//
//         int[] ans = new int[n];
//
//         ans[0] = 1;
//         for (int i = 1; i < n; i++){
//             ans[i] = ans[i - 1] * nums[i - 1];
//         }
//
//         // for (int i : ans){
//         //     System.out.println(i);
//         // }
//         //
//         // System.out.println("------------");
//
//         int rightProduct = nums[n - 1];
//
//         for (int i = n - 2; i >= 0; i--){
//             ans[i] = ans[i] * rightProduct;
//             rightProduct = rightProduct * nums[i];
//         }
//
//         for (int i : ans){
//             System.out.println(i);
//         }
//     }
// }
