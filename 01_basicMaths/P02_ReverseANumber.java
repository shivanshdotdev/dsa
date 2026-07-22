public class P02_ReverseANumber {
    public static void main(String[] args) {
        int number = 12345;

        int reversed = 0;

        while (number != 0){
            int pop = number % 10;
            number /= 10;

            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && pop > 7)){
                System.out.println(0);
                return;
            }

            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && pop < -8)){
                System.out.println(0);
                return;
            }

            reversed *= 10;
            reversed += pop;
        }

        System.out.println(reversed);



        // The scenario of 32-bit int limt being overflowed
        // that risk is always lurking
        // so 
        // either use long instead of int and if that is not allowed 
        // create the following conditional at the end 

        // if long is allowed but still the value is more than int-32 limit
        if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE){
            System.out.println(0); // basically the reversed number is already more than or less than Integer's limit 
        }

        // if the long is not allowed, or you are on a 32-bit system where 64-bit long is not possible 
        // BOTH condition is written before the multiplication of the reverse with 10
        if (reversed > Integer.MAX_VALUE/10 || (reversed == Integer.MAX_VALUE / 10 && pop > 7)){
            System.out.println(0);
            // pop is just a leetcode way of saying the last digit
        }
        if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE && pop > 7)){
            System.out.println(0);
        }

        // Condition 1 
        // the Integer's max value is 2147483647, so if reversed is 214748364 its multiplication with 10 will going to overflow the integer limit 

        // Condition 2 
        // If the reversed is equal to MAX_VALUE / 10 and the last digit of the number was more than 7, it would still overflow else 
        // it would be within the bounds 


    }
}
