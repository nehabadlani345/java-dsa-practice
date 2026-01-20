//buy and sell stocks if multiple transactions are allowed 

public class BuyAndSellStocksII{
  public static int stocks(int prices[]){
    int n=prices.length;
    int maxProfit = 0;

  
    for(int j=1;j<n;j++){
      if(prices[j-1]<prices[j]){
        int profit = prices[j]-prices[j-1];
         maxProfit = maxProfit + profit;
    
      }
    }

    return maxProfit;
  }

  public static void main(String[] args) {
      int prices[] = {7,1,5,3,6,4};
      System.out.println(stocks(prices));
  }
}