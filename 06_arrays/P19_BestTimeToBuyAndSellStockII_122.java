public class P19_BestTimeToBuyAndSellStockII_122 {
    public static void main(String[] args) {
        int[] prices = {1,2,3,4,5};

        int n = prices.length;
        int maxProfit = 0;

        for (int i = 1; i < n; i++){
            int profit = prices[i] - prices[i - 1];

            if (profit > 0){
                maxProfit = maxProfit + profit;
            }
        }

        System.out.println(maxProfit);
    }
}
