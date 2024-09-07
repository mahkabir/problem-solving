package slidingWindow;

public class BestTimeToBuyAndSellStock121 {

   /* public int findBestPrices(int [] prices){   //T.C  O(n^2)  S.C  O(1)
        int res = 0;
        int n = prices.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 1; j < n; j++) {
                res = Math.max(res, prices[j] - prices[i]);
            }
        } return res;
    }*/
    public int findBestPrices(int [] prices){ //T.C O(n)     S.C O(1)
        int minPriceSoFar = prices[0];
        int n = prices.length;
        int res = 0;
        for (int i = 1; i < n; i++) {
          minPriceSoFar = Math.min(minPriceSoFar,prices[i]);  //O(1)  T.C of Math.min,Math.max
          res = Math.max(res,prices[i]-minPriceSoFar);      // O(1)
        }
        return res;
    }

    public int maxProfit(int[] prices) {  //neetcode solution
        int left = 0;
        int right = 1;
        int maxProfit = 0;
        while (right < prices.length) {
            if (prices[left] < prices[right]) {
                maxProfit = Math.max(maxProfit, prices[right] - prices[left]);
            } else {
                left = right;
            }
            right++;
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int [] prices = {7,1,5,3,6,4};
        BestTimeToBuyAndSellStock121 solution  = new BestTimeToBuyAndSellStock121();
        System.out.println("best price: " +solution.findBestPrices(prices));
    }
}
