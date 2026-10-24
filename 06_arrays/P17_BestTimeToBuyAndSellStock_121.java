public class P17_BestTimeToBuyAndSellStock_121 {
    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};

        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int i : prices){
            
            if (maxProfit < i - minPrice){
                maxProfit = i - minPrice;
            }

            if (minPrice > i){
                minPrice = i;
            }
        }

        System.out.println(maxProfit);

    }
}
