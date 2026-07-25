public class P03_ReversePrintingNTo1 {
    public static void main(String[] args) {
        int limit = 10;

        forwardRecursion(limit);
        backTracking(1, limit);
    }

    public static void forwardRecursion(int limit){
        if (limit <= 0) return; 

        System.out.println(limit);

        forwardRecursion(limit - 1);
    }

    public static void backTracking(int current, int limit){

        if (current > limit) return;

        backTracking(current + 1, limit);

        System.out.println(current);
    }
}
