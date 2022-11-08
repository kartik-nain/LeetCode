class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        
        while(left<right){
            int mid = left + (right-left)/2;
            
            if(nums[mid]>nums[mid+1]){
                right = mid;  //Reducing to left subarray including larger of mid and mid+1 elements
            }else{
                left = mid+1; //Reducing to right subarray including larger of mid and mid+1 elements
            }
        }
        
        return left;
    }
}