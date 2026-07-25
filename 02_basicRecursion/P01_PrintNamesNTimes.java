public class P01_PrintNamesNTimes {
    public static void main(String[] args) {
        int times = 5;
        
        if (times < 1) return;

        printNTimes("Shivansh", times);

    }

    public static void printNTimes(String name, int n){
        if (n <= 0){
            return;
        }

        System.out.println(name);
        printNTimes(name, n - 1);

        // --n can be used as well but it will change the parameter given itself which is not recommended 
    }
}

