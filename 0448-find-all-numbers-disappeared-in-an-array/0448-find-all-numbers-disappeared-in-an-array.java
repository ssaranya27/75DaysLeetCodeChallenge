class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        List<Integer> disappeared=new ArrayList<>();
        HashSet<Integer> res=new HashSet<>();
        for(int i=0;i<n;i++){
            res.add(nums[i]);
        }
        for(int i=1;i<=n;i++){
            if(!res.contains(i)){
                disappeared.add(i);
            }
        }
        return disappeared;
        
        
    }
}