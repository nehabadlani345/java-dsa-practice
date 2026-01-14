import java.util.*;
public class InsertPosition{
  public static int InsertPosition(int nums[],int target){
    
    for(int i=0;i<nums.length;i++){
      if(nums[i]>=target){
        return i;
      }
    }
    return nums.length;
  }

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the target");
      int target = sc.nextInt();
      int nums[]= {1,3,4,5,6};
      System.out.println(InsertPosition(nums, target));

  }
}
