public class P07_CheckIfNumberIsPrime {
    public static void main(String[] args) {
        int number = 10;

        if (number < 2){
            System.out.println(false);
            return;
        }

        boolean isPrime = true;

        for (int i = 2; i * i <= number; i++){
            if (number % i == 0){
                isPrime = false;
                break;
            }
        }

        System.out.println(isPrime);

        // Even though this is already very optimized
        // there is one more that can be done and that is the approach of prime number greater than 3 can be represented as 6k + 1
        // search on it yourself
        // I am not in mood to document that...🥱
    }
}
