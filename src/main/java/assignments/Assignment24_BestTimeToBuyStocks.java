package assignments;

public class Assignment24_BestTimeToBuyStocks {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};  // Example input
        int maxProfit = 0;
        int buyDay = 0, sellDay = 0;

        for (int i = 0; i < prices.length - 1; i++) {  // Loop for buy day
            for (int j = i + 1; j < prices.length; j++) {  // Loop for sell day
                int profit = prices[j] - prices[i];  // Calculate profit
                
                if (profit > maxProfit) {  // Update if new max profit found
                    maxProfit = profit;
                    buyDay = i + 1;  // Store day (1-based index)
                    sellDay = j + 1;
                }
            }
        }

        if (maxProfit > 0) {
            System.out.println("Max Profit: " + maxProfit);
            System.out.println("Buy on day: " + buyDay + ", Sell on day: " + sellDay);
        } else {
            System.out.println("No profitable transactions possible.");
        }
    }

}
