public class P11_BinaryNumberRightTriangle {
    public static void main(String[] args) {
        int size = 5;

        // METHOD 1 

        // As it can be seen that the even row is starting with 0 and odd row is starting with 1
        // for a single cycle of i, j increases hence making an even-odd sequence
        // because j is always starting with 1, we cannot use it to accuratly identify the actual nature of the row number 
        // so we use a constant i which does not change for a particular cycle of j
        // since i is either going to be odd or even in a j's cycle 
        // adding the alternating j will give us the nature of row number and will also help in alternating the actual building values which is used in METHOD 2

        for (int i = 1; i <= size; i++){
            for (int j = 1; j <= i; j++){
                if ((i + j) % 2 == 0){
                    System.out.print(1);
                }
                else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }

        // METHOD 2

        // similar to above but rather than hardcoding the writing values 
        // those are also being calculated as the per row number and cell or position number's nature 

        int start;
        for (int i = 1; i <= size; i++){
            // if row number is even, it is starting with 0 else 1
            // and then during writing, it is being alternated at each j's cycle

            if (i % 2 == 0) start = 0;
            else start = 1;

            // the above assignment of variables can be sugared into a single line
            // int start = (i % 2 == 0) ? 0 : 1;

            for (int j = 1; j <= i; j++){
                System.out.print(start);
                // the start has only 2 possible values, 0 and 1 
                // so 1 - 1  will make it 0 and 1 - 0 will make it 1 
                start = 1 - start;
            }
            System.out.println();
        }



        // METHOD 3 - UNOPTIMIZED OVER-ENGINEERED STATE MANAGEMENT
        
        boolean printOne = true;
        boolean startWithOne = true;

        for (int i = 1; i <= size; i++){
            for (int j = 1; j <= i; j++){
                if (startWithOne){

                    if (printOne){
                        System.out.print(1);
                    }
                    else {
                        System.out.print(0);
                    }

                    printOne = !printOne;
                }
                else {
                    if (!printOne){
                        System.out.print(1);
                    }
                    else {
                        System.out.print(0);
                    }

                    printOne = !printOne;
                }
            }
            printOne = true;
            startWithOne = !startWithOne;
            System.out.println();
        }
    }
}
