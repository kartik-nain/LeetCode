class Solution {
    public int[] singleNumber(int[] nums) {
        int[] ans = new int[2];
        int xxory = 0;
        
        for(int num: nums){
            xxory = num^xxory;  //At the end, xxory will contain 2 non-repeating numbers
        }
        
        //Finding the righmost set bit of xxory because their xor will conatin 1 at someplace which will be due to one of these two numbers contain'g 1 at that place and xor of 0 and 1 is 1.
        int setBit = xxory & ~(xxory-1);
        
        //Now, the array will be divided in 2 parts due to if else conditions
        for(int num:nums){
            if((num&setBit) == 0){
                ans[0] = ans[0]^num; //ans[0] was initially 0, at end it will contain that single number whose bit at setbit's index was 0(repeat numbers will be cancelled due to ^)
            }else{
                ans[1] = ans[1]^num;
            }
        }
        
        return ans;
    }
}