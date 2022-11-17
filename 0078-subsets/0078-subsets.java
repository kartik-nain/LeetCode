class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>(); 
        backTrack(ans, temp, nums, 0); //Starting from 0 index
        return ans;
    }
    
    public void backTrack(List<List<Integer>> ans, List<Integer> temp, int[] nums, int index){
        
        //Base condition
        if(index == nums.length){
            ans.add(new ArrayList<>(temp)); //Can't add temp directly because we need a deep copy or a current snapshot of the temp list as this list keeps on changing. Only shallow here will add references to the list
            return;
        }
        
        //Pick the element and move ahead
        temp.add(nums[index]);
        backTrack(ans, temp, nums, index+1);
        
        //Don't pick the element and move ahead
        temp.remove(temp.size()-1);
        backTrack(ans, temp, nums, index+1);
    }
}