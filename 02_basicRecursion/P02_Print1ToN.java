public class P02_Print1ToN {
    public static void main(String[] args) {
        int limit = 10;

        printCountingForwardRecursion(1, limit);

        printCountingBackTracking(limit);
    }

    // this is also known a Tail Recursion 
    // Work -> Recurse
    public static void printCountingForwardRecursion(int n, int limit){
        if (n > limit){
            return;
        }

        System.out.println(n);

        printCountingForwardRecursion(n+1, limit);
    }

    // this is also known as Head Recursion 
    // Recurse -> Work before popping the Stack Frames
    public static void printCountingBackTracking(int limit){

        if (limit <= 0) return;

        printCountingBackTracking(limit - 1);

        System.out.println(limit);

    }
}
