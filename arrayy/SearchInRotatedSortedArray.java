public class SearchInRotatedSortedArray{
  public static int SearchInRotatedSortedArray(int nums[],int target){
    int n=nums.length;
    int left=0;
    int right=n-1;

    while(left<=right){
      int mid=(left+right)/2;

      if(target == nums[mid]){
        return mid;
      }

      if(nums[left]<=nums[mid]){
        if(target>=nums[left] && target<nums[mid]){
          right = mid-1;
        }
        else{
          left = mid+1;
        }
      }
      else{
        if(target>nums[mid] && target<=nums[right]){
          left = mid-1;
        }
        else{
          right=mid+1;
        }
      }
    }
    return -1;
  }

  public static void main(String[] args) {
      int nums[] = {4,5,6,7,0,1,2,3};
      int target = 3;
      System.out.println(SearchInRotatedSortedArray(nums, target));
  }
}