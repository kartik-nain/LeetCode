public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int ans = 0;
        
        //Remember here index starts from right and move to left unlike an array
        for(int i = 0; i<32; i++){
            int rsb = n & 1; //Get the last or rightmost bit, rsb will be 1 if n has 1 at end or else will be 0.
            int temp = rsb<<(31-i); //Move rsb to first or leftmost untouched side
            ans = ans|temp; //Save rsb in ans.
            n = n>>1; //Move left to next untouched index
        }
        
        return ans;
    }
}