class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> count= new HashMap<>();
        int[] result=new int[k];
        Arrays.sort(nums);
        for(int i:nums){
            if(count.containsKey(i)){
                count.put(i,count.get(i)+1);
            }else{
                count.put(i,1);
            }
        }
         PriorityQueue<Map.Entry<Integer, Integer>> pq =new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

pq.addAll(count.entrySet());

for (int i = 0; i < k; i++) {
    result[i] = pq.poll().getKey();
}
return result;
    }
}