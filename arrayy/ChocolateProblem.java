import java.util.*;

public class ChocolateProblem{
  public static int ChocolateProblem(int nums[] , int m){
    Arrays.sort(nums);
    int MinDiff = Integer.MAX_VALUE;
    for(int i=0;i+m-1<nums.length;i++){
      int diff = nums[i+m-1] - nums[i];
      MinDiff = Math.min(MinDiff,diff);
    }

    return MinDiff;
  }

  public static void main(String[] args) {
      int nums[] = {7, 3, 2, 4, 9, 12, 56};
      int m = 3;
      System.out.println(ChocolateProblem(nums, m));
  }
}