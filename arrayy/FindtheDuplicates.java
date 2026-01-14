import java.util.*;
public class FindtheDuplicates{
  public static int findDuplicates(int nums[]){

    Arrays.sort(nums);
    int dup = -1;
    for(int i=0;i<nums.length-1;i++){
      if(nums[i]==nums[i+1]){
        dup = nums[i];
      }
    }
    return dup;
  }

  public static void main(String[] args) {
    
      int []nums={4,3,2,7,8,2,3,1};
      System.out.println(findDuplicates(nums));

  }
}