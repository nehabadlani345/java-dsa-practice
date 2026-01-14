
public class RemoveTheDuplicates{
  public static int removeDpus(int nums[]){
    int i=0;
    for(int j=1;j<nums.length;j++){
      if(nums[i] != nums[j]){
        i++;
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j]=temp;
      }
    }
    return i+1;
  }

  public static void main(String[] args) {
      int nums[] = {0,0,1,1,1,2,2,4,5,5,6};
      removeDpus(nums);
    for(int i=0;i<nums.length;i++){
      System.out.print(nums[i] + " ");
    }
  }
}