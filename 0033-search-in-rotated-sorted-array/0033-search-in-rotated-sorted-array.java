class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        
        //One of the halves will definitely be sorted because nums is rotated only one time
        while(left<=right){
            int mid = left + (right-left)/2;
            
            if(nums[mid]==target){
                return mid;
            }
            
            if(nums[left]<=nums[mid]){ //This means that the left half is sorted
                if(nums[left]<=target && target<nums[mid]){ //Checking if the target lies in this half
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }else{ //Thus the right half is sorted
                if(nums[mid]<target && target<=nums[right]){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
        }
        
        return -1; //Element not found.
    }
}