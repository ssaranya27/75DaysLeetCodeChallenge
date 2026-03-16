class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> ans=new HashMap<>();
        for(String s: strs){
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            String word=new String(ch);

            ans.putIfAbsent(word,new ArrayList<>());
            ans.get(word).add(s);
        }
        return new ArrayList<>(ans.values());
    }
}