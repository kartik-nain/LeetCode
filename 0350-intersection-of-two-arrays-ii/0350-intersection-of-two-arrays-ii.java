class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int num: nums1){
            hm.put(num, hm.getOrDefault(num, 0)+1);
        }
        
        for(int num: nums2){
            if(hm.containsKey(num) && hm.get(num)!=0){
                ans.add(num);
                hm.put(num, hm.get(num)-1);
            }
        }
        
        int[] a = new int[ans.size()];
        for(int i = 0; i<ans.size(); i++){
            a[i] = ans.get(i);
        }
        return a;
    }
}