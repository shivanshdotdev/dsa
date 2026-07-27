public class P08_FibonacciNumbers {
    public static void main(String[] args) {
        int number = 15;

        fibonacci(0, 1, number); // 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377

        System.out.println();

        System.out.println(fibonacciAtNthPlace(number)); // 610 

        // this is showing different answer because of 0 based indexing 
        // above printed the 15 numbers starting from 0th to 14th 
        // this prints the 15th index number 
    }

    private static void fibonacci(int current, int prev, int terms){
        if (terms == 0) return;

        System.out.print(current + " ");
        fibonacci(prev, current + prev, terms - 1);

    }

    private static int fibonacciAtNthPlace(int n){
        if (n <= 1) return n; // return 0 or 1 because 0th fibonacci is 0 and 1st is 1
        
        int last = fibonacciAtNthPlace(n - 1);
        int secondLast = fibonacciAtNthPlace(n - 2);

        return last + secondLast;
    }
}
