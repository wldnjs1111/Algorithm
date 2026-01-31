class Solution {
    public boolean containsDuplicate(int[] nums) {
        /*
        // Arrays.sort(nums);
        
        for(int i=0;i<nums.length - 1;i++){
            if(nums[i] == nums[i+1]){
                return true;
            } 
        } 
        return false;
        */

        Set<Integer> ans = new HashSet<>();
        for(int n:nums){
            if(ans.contains(n)){
                return true;
            }
            ans.add(n);
        }
        return false;
    }
}