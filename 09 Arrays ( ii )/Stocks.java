public class Stocks {
    public static int buyAndSellStocks(int stockPrices[]) {

        int maxProfit = 0; // in starting (initialize)
        int buyStock = Integer.MAX_VALUE;

        for (int i=0; i<stockPrices.length; i++) {
            if (buyStock < stockPrices[i]) {
                // Today's profit (profit/day)
                int profit = stockPrices[i] - buyStock;
                System.out.println("Profit : " + profit + "/day");
                // Global Profit (maximum in all day)
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyStock = stockPrices[i];
                System.out.println("Buying Price of Stock : " + buyStock);
            }
        }
        System.out.print("Maximum Profit in all day : ");
        return maxProfit;
    }
    public static void main(String args[]) {

        // Buy and Sell Stocks and Calculate the maximum profit

        // Prices of the Stocks - array
        int stockPrices[] = {7, 1, 5, 3, 6, 4};

        System.out.println(buyAndSellStocks(stockPrices)); // Function call for print
    }    
}