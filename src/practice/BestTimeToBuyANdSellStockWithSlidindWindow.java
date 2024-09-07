package practice;

public class BestTimeToBuyANdSellStockWithSlidindWindow {
    private int maxProfit(int [] arr) {
        int left = 0;
        int right = 1;
        int profit = 0;
        while (right < arr.length) {
            if (arr[left] < arr[right]) {
                profit = Math.max(profit, arr[right] - arr[left]);
            } else {
                left = right;
            }
            right++;
        }

        return profit;
    }
    public static void main(String[] args) {
        int [] arr = {7,1,5,3,6,4};
        BestTimeToBuyANdSellStockWithSlidindWindow sln = new BestTimeToBuyANdSellStockWithSlidindWindow();
        int  result = sln.maxProfit(arr);
        System.out.println("indices are : "+ result);
    }
}
