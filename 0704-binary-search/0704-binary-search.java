class Solution {
    public int search(int[] arr, int val) {
        int left = 0;
		int right = arr.length-1;
		
		while(left<=right) {
            int mid = left + (right-left)/2; //To avoid integer overflow
            
            if(arr[mid] == val){
                return mid;
            }else if(val<arr[mid]) {
				right = mid-1;
			}else {
				left = mid+1;
			}
		}
		
		return -1;
    }
}