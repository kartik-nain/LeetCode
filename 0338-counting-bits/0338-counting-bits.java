class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        
        for(int i=0; i<=n; i++){
            ans[i] = count(i);
        }
        
        return ans;
    }
    
    public int count(int a){
        int count = 0;
        
        while(a!=0){
            a = a&(a-1);
            count++;
        }
        
        return count;
    }
}