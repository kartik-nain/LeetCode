class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        
        ans[0] = findStart(nums, target);
        ans[1] = findEnd(nums, target);
        
        return ans;
    }
    
    public int findStart(int[] nums, int target){
        int left = 0;
        int right = nums.length-1;
        int index = -1;
        
        while(left<=right){
            int mid = left+(right-left)/2;
            
            if(nums[mid]>=target){
                right = mid-1; //right pointer will keep on decrementing until leftmost target value is found.
            }else{
                left=mid+1;
            }
            if(nums[mid]==target) index = mid; //Can't write this first because we have to decrement right until leftmost value
        }
        
        return index;
    }
    
    public int findEnd(int[] nums, int target){
        int left = 0;
        int right = nums.length-1;
        int index = -1;
        
        while(left<=right){
            int mid = left+(right-left)/2;
            
            if(nums[mid]<=target){
                left = mid+1; //left pointer will keep on incrementing until rightmost target value is found.
            }else{
                right = mid - 1;
            }
            if(nums[mid]==target) index = mid; 
        }
        
        return index;
    }
}