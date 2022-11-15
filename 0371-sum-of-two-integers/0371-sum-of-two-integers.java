//For 2 zeroes and 2 ones at same index of a and b,we need 0 and for one zero and one one at an index, we need 1 there, hence xor is used. But xoe will not take care of the carry, hence for carry we will use '&' and left shift it by 1.

class Solution {
    public int getSum(int a, int b) {
        
        while(b!=0){
            int temp = (a&b)<<1; 
            a = a^b; //This should be the first step, but for '&' operation, we need original value of a, not this modified value, hence we are saving operations on original 'a' value before this step in a temp variable.
            b = temp;
        }
        
        return a;
    }
}