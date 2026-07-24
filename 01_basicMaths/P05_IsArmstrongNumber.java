public class P05_IsArmstrongNumber {
    public static void main(String[] args) {
        int number = 371;

        // edge case
        if (number == 0){
            System.out.println(true);
            return;
        }

        // negative numbers will be handled as well as armstrong is only defined for positive, so negative is being converted to positive
        number = Math.abs(number);
        int power = (int) Math.log10(number) + 1;

        int sum = 0;
        int original = number;

        while (number > 0){
            int digit = number % 10;
            number /= 10; 
            int numToAdd = 1;

            for (int i = 0; i < power; i++){
                numToAdd *= digit;
            }

            sum += numToAdd;
        }

        boolean isArmstrong = (original == sum);

        System.out.println(isArmstrong);
    }
}
