
import java.util.Scanner;

//find the second maximum number in an array

public class SecondMax{
  public static int SecondMax(int nums[]){
    int n = nums.length;
    if(n<2){
      return -1;
    }

    int max= Integer.MIN_VALUE;
    int secMax = Integer.MIN_VALUE;

    for(int i=0;i<n;i++){
      if(max<nums[i]){
        secMax=max;
        max=nums[i];
      }
      else if(secMax<nums[i] && nums[i]!=max){
        secMax = nums[i];
      }
    }

    if(secMax < 0){
      return -1;
    }
    else{
      return secMax;
    }
  }
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int nums[] = {12,35,1,10,34,1,35};
      System.out.println(SecondMax(nums));
  }
}