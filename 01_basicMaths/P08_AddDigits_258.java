public class P08_AddDigits_258 {
    public static void main(String[] args) {
        int nums = 111;

        int sum = 0;
        while (nums > 9){
            sum = sum + nums % 10;
            nums /= 10;
        }

        // recursion is used 

        // if (sum < 10){
        //     return sum;
        // }
        // else {
        //     return addDigits(sum);
        // }
        System.out.println(nums);
    }
}
