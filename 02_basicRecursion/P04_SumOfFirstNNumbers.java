public class P04_SumOfFirstNNumbers {
    public static void main(String[] args) {
        int number = 5;

        int sum = forwardTracking(number, 0);
        System.out.println(sum);

        sum = backTracking(number);
        System.out.println(sum);
    }

    public static int forwardTracking(int number, int sum){
        
        if (number <= 0) return sum;

        sum += number;

        sum = forwardTracking(number - 1, sum);

        return sum;
    }

    public static int backTracking(int number){

        if (number <= 0){
            return 0;
        }

        return number + (backTracking(number - 1));
    }

    // the other two methods which are non-recursive are 
    // brute-force loop >>> from 1 to limit adding all digits
    // sum = N(N+1)/2
}
