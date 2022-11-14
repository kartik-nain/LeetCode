class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        
        for(int i = 0; i<32; i++){
            int count = 0; //Counting number of ones for all nums at a particular index i
            int mask = 1<<i;
            
            for(int j = 0; j<nums.length; j++){
                if((nums[j]&mask)!=0){
                    count++;
                }
            }
            
            if(count%3==1){
                ans = ans | mask;
            }
        }
        
        return ans;
    }
}