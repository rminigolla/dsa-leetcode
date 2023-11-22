class Solution {
    public int findMin(int[] nums) {
        int n = nums.length-1;
        int s = 0 ;
        int e = n ;
        int mid ;
        while (s < e){
            mid = s + (e-s)/2 ;
            if (nums[mid] < nums[e]){
                e = mid ;
            }
            else if (nums[mid] > nums[e]){
                s = mid + 1 ;
            }
            else e-- ;
        }
        
      return nums[s] ;  
        
    }
}