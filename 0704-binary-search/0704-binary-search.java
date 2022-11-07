class Solution {
    public int search(int[] arr, int val) {
        int left = 0;
		int right = arr.length-1;
		int mid = (left+right)/2;
		
		while(arr[mid]!=val && left<=right) {
			if(val<arr[mid]) {
				right = mid-1;
			}else {
				left = mid+1;
			}
			mid = (left+right)/2;
		}
		
		if(arr[mid]==val) {
			return mid; //Returning the index of the value
		}else {
			return -1;
		}
    }
}