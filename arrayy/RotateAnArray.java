//rotate to the write 

public class RotateAnArray{
  public static void rotate(int nums[] , int k){
    int n = nums.length;
    k =k%n;
    int d = n-k;
   
    reverse(nums, 0, d-1);
    reverse(nums, d, n-1);
   reverse(nums, 0, n-1);
 
    //  return rotate(nums, k);
  }

  public static void reverse(int nums[], int start,int end){
    while(start<end){
      int temp = nums[start];
       nums[start] = nums[end];
       nums[end] = temp;
       start++;
       end--;
    }
  }

  public static void main(String[] args) {
      int nums[] ={-1,-100,3,99};
      int k = 3;
      rotate(nums, k);
       for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
      
  }
}