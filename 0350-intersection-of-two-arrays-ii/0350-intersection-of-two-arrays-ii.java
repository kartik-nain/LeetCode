class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> ans = new ArrayList<>();
        int i1 =0;
        int i2 = 0;
        
        while(i1<nums1.length && i2<nums2.length){
            if(nums1[i1] == nums2[i2]){
                ans.add(nums1[i1]);
                i1++;
                i2++;
            }else if(nums1[i1]<nums2[i2]){
                i1++;
            }else{
                i2++;
            }
        }
        
        int[] arr = new int[ans.size()];
        for(int i = 0; i<ans.size(); i++){
            arr[i] = ans.get(i);
        }
        
        return arr;
    }
}