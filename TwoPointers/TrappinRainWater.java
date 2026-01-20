public class TrappinRainWater{
  public static int TrappinRainWater(int heights[]){
    int n = heights.length;
    
    int leftMax[] = new int[n];
    leftMax[0] = heights[0];
    for(int i=1;i<n;i++){
      leftMax[i] = Math.max(heights[i], leftMax[i-1]);
    }

    int rightMax[] = new int[n];
    rightMax[n-1] = heights[n-1];
    for(int j=n-2;j>=0;j--){
      rightMax[j] = Math.max(rightMax[j+1],heights[j]);
    }

    int trappedWater = 0;
    for(int i=0;i<n;i++){
      int waterlevel = Math.min(leftMax[i] , rightMax[i]);
      trappedWater += waterlevel - heights[i];
    }

    return trappedWater;
  }


  public static void main(String[] args) {
      int heights[] ={0,1,0,2,1,0,1,3,2,1,2,1};
      System.out.println(TrappinRainWater(heights));
  }
}