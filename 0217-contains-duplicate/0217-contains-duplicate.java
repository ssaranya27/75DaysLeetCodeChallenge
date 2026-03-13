class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length==1)
        return false;
        HashMap<Integer,Integer> dup=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(dup.containsKey(nums[i])){
                return true;
            }
            dup.put(nums[i],i);
            
        }
        return false;
    }
}