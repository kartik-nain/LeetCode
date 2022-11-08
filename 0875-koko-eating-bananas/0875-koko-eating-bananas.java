class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxPile = 1; //Minimum pile can be 1
        
        for(int pile: piles){
            maxPile = Math.max(maxPile, pile);
        }
        
        int left = 1;  //Left pointer is 1 as koko will have to eat min. 1 banana out of a pile per hour
        int right = maxPile; //Max. bananas she can eat per hour is the no. of bananas in the max. pile
        
        while(left<=right){
            int mid = left + (right-left)/2;
            int hoursSpent = 0;
            
            for(int pile: piles){
                hoursSpent+=Math.ceil((double)pile/mid);  //ceil function on int does not give correct answer. For                                                                 ceil to work correctly at least either p or k should be                                                               double.When you do p*1.0, you convert it into double, so                                                               it works.
                                                             
            }
            
            //Can't return mid here
            if(hoursSpent>h){
                left = mid+1;
            }else{
                right = mid -1;
            }
        }
        
        return left; //Returning left here because in Input: piles = [3,6,7,11], h = 8; k=4 and 5 give same answer but left variable 4 is preferred because we have to return minimum integer k
    }
}