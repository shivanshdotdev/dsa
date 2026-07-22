public class P01_CountAllDigitsOfNumber {
    public static void main(String[] args) {
        int number = 7789;

        // ========================================
        // METHOD 1 
        // Brute Force - O(N)
        int count = 0;

        if (number == 0){
            System.out.println(1);
            return;
        }

        if (number < 0) number *= -1;

        while (number > 0){
            number /= 10;
            count++;
        }

        System.out.println(count);

        // ========================================
        //  METHOD 2 
        // Optimized - O(1)

        if (number == 0){
            System.out.println(1);
            return;
        }

        number = Math.abs(number); // if number is negative, make it positive

        // log10 of any number tells the number of digit the number has - 1
        // so we added the 1 back and got the number of digit
        // WORKING IS MENTIONED AT THE END
        count = (int) Math.log10(number) + 1;

        System.out.println(count);

        // ========================================
        // THE ONE LINER 

        count = (number == 0) ? 1 : (int) Math.log10(Math.abs(number)) + 1;
        System.out.println(count);

    }

    // WORKING 
    /*
     * loga(b) means what exponent power of a will leads to b
     * such as 
     * log2(8) = 3 because 2^3 is 8
     * log10(1000) = 3 because 10^3 is 1000
     *
     * now observe that
     * 10^3 generates a 4 digit number = 1000 
     * 10^4 generates a 5 digit number = 10000
     *
     * so any number between these values is going to be 4 digit number 
     * if log10(1000) is 3 and log10(10000) is 4
     * any number in between them is going to yield between 3 and 4 which will be in decimal
     *
     * now since we are typecasting the log10 yeild value into int, the decimal is going to be dropped,
     * so for any 4 digit number, the yield is always going to be 3
     * SO FOR ANY N digit number, the yield is always going to be N-1
     *
     * and then we are adding that 1 back and hence 
     * getting the digits of the number in most Optimized way which is O(1)
     */

    // if you are curious on why only log10 is a method given and not for other values 
    // any other logx can be calculated using division method which is 
    // log10(number) / log10(base who log we want)
    // so
    // log10(N)/log10(x)
    //
    // HOW ? SEARCH ONLINE BRUH
}
