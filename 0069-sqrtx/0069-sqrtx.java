class Solution {
    public int mySqrt(int x) {
        if(x==0 || x==1) return x;
        
        int left = 0;
        int right = x;
        
        
        while(left<=right){
            int mid = left + (right-left)/2;
            
            if(mid==x/mid) return mid;
            if(mid>x/mid){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        
        return right;
    }
}
// Visual Run x = 8
// X   Left  Right  Mid  compare  X/Mid
// 8     0    8      4       >       2
// 8     0    3      1       <       4
// 8     2    3      2       >       2 Returned mid