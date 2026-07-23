public class P04_HCForGreatestCommonDivisor {
    public static void main(String[] args) {
        int num1 = 208;
        int num2 = 182;

        num1 = Math.abs(num1);
        num2 = Math.abs(num2);

        if (num1 == 0){
            System.out.println(num2);
            return;
        }
        else if (num2 == 0){
            System.out.println(num1);
            return;
        }

        int divisor = num1;
        int dividend = num2;
        
        // Euclid's division algorithm 
        // Working is at the end 
        while (true){
            int remainder = dividend % divisor;

            if (remainder == 0) break;

            dividend = divisor;
            divisor = remainder;
        }

        System.out.println(divisor);

        // WORKING 
        // This is not something new, the same long division method we studied in the school is being used here 
        // divide the larger with smaller number 
        // if there is any remainder, divide the divisor with the remainder 
        // repeat the process until the remainder becomes 0 
        // when it does, the divisor is the HCF or GCD 
    }
}
