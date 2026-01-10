
public class BuyAndSellStocks{
  public static int buyStocks(int prices[]){

    int BuyPrice = Integer.MAX_VALUE;
    int maxprofit=0;

    for(int i=0;i<prices.length;i++){
      if(prices[i]<BuyPrice){
        BuyPrice=prices[i];
      }
      else{
        int profit = prices[i] - BuyPrice;
        maxprofit = Math.max(maxprofit, profit);
      }
    }

    return maxprofit;
  }

  public static void main(String[] args) {
    int prices [] ={7,1,5,3,6,4};
    System.out.println(buyStocks(prices));
  }
}