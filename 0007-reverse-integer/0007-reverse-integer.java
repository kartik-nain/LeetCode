class Solution {
    public int reverse(int x) {
        int ans = 0;
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        
        while(x!=0){ //When all digits are popped from x(using x/10), x will become 0 and loop will stop
            int lastDigit = x%10; //Extracting last digit
            x = x/10; //Removing last digit from x
            
            
            //ans can be very large from max value, so first condition; ans/10 can be equal to max/10 and lastdigit of ans can be larger than last digit of max so second condition.
            if( (ans>max/10) || (ans==max/10 && lastDigit>7) ){
                return 0;
            }
            //Same is true for min value
            if( (ans<min/10) || (ans==min/10 && lastDigit<-8) ){
                return 0;
            }
            
            ans = ans*10 + lastDigit; //Appending lastDigit to ans
        }
        
        return ans;
    }
}