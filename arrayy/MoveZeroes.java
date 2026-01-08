
import java.util.Scanner;

public class MoveZeroes {
  public void MoveZeroes(int nums[]){
    int count =0;
    for(int i=0;i<nums.length;i++){
      if(nums[i]!=0){
      int temp = nums[i];
      nums[i]=nums[count];
      nums[count]=temp;
      count++;
    }
    }
  }

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int nums[] = {1,2,0,4,3,0,5,0};
      MoveZeroes mz = new MoveZeroes();
      mz.MoveZeroes(nums);
      for(int i=0;i<nums.length;i++){
        System.out.print(nums[i]+" ");
      }
  }
}
