public class P19_BestTimeToBuyAndSellStockII_122 {
    public static void main(String[] args) {
        int[] prices = {1,2,3,4,5};

        int n = prices.length;
        int maxProfit = 0;

        for (int i = 1; i < n; i++){
            if (prices[i] - prices[i-1] > 0){
                maxProfit = maxProfit + (prices[i] - prices[i - 1]);
            }
        }

        System.out.println(maxProfit);
    }
}
