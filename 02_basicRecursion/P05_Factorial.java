public class P05_Factorial {
    public static void main(String[] args) {
        int number = 5;

        int factorial = factorial(number);

        System.out.println(factorial);
    }

    public static int factorial(int num){
        
        // only factorial of number more than 0... Because I hate negativity 
        if (num <= 1) return 1;

        return num * (factorial(num - 1));
    }
}
