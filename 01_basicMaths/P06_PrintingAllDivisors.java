public class P06_PrintingAllDivisors {
    public static void main(String[] args) {
        int number = 36;
        number = Math.abs(number);

        if (number == 0){
            System.out.println("Undefined or Infinitely Many");
            return;
        }

        // ===================================================
        // Normal Approach - O(N)
        int loopLimit = number / 2;

        for (int i = 1; i <= loopLimit; i++){
            if (number % i == 0){
                System.out.print(i + ", ");
            }
        }
        System.out.println(number);

        // ===================================================
        // Better Approach - O(underroot N)
        // Logic is explained in basicProblems github repo >>> 04_IsPrime.md 
        // https://github.com/shivanshdotdev/QuickBasicRevision/blob/main/04_IsPrime.md [Copy and paste]

        for (int i = 1; i * i <= number; i++){
            if (number % i == 0) {
                System.out.print(i + " ");

                int anotherFactor = number / i; 

                if (anotherFactor != i){
                    System.out.print(anotherFactor + " ");
                }

            }
        }

        System.out.println();

        // If you want the 2nd Approach to print in an order as well
        // Either 
        // Create an array list >>> store the factors/divisors >>> sort and print 
        // OR 
        // a smart approach being only storing the anotherFactor or larger factors in the arrayList 
        // and then printing the list in reverse hence getting the order but its your choice or question's demand

    }
}
