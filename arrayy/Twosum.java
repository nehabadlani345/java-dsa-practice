

public class Twosum{
   public static int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int results [] = new int[2];
        for(int i=0;i<n-1;i++){
            for(int j=1+i;j<n;j++){
                if(nums[i]+nums[j]==target){
                     results[0] = i ;
                     results[1] = j ;
                }
            }
        }
        return results;
    }

    public static void main(String[] args) {
        int nums[] = {2,7,11,15};
        int target = 9;
       int[] ans = twoSum(nums, target);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }

    }
}