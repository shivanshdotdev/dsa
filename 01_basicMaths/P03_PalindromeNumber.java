public class P03_PalindromeNumber {
    public static void main(String[] args) {
        int number = 12121;

        // -121 is 121- and hence any negative number can never be palindrome since the minus sign will pop at the end 
        // if the number ends with 0, such as 100 or 110, its reverse is 1 or 11 hence never palindrome, so number ending with 0, never palindrome
        if (number < 0 || (number != 0 && number % 10 == 0)){
            System.out.println(false);
            return;
        }

        int reverseHalf = 0; 

        // only checking half digits
        // for 1221, checking if 12 == 12(from right to left)
        // for 12321, checking if 12 == 12(from right to left) ignoring the mid since it is going to be in the mid anyways
        while (number > reverseHalf){
            int pop = number % 10;
            number /= 10; 

            reverseHalf *= 10;
            reverseHalf += pop;
        }

        // first condition is for even numbers 
        // second is for odd 
        // since in odd, the mid digit is going to be at the end, removing it will make the condition same as above 
        // AND 
        // the actual number variable is also getting smaller due to /= 
        System.out.println(number == reverseHalf || number == reverseHalf / 10);

    }
}
