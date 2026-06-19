class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String,List<String>> anagram = new HashMap<>();
       for(String str : strs){
        char[] charArr = str.toCharArray();
        Arrays.sort(charArr);
        String key = String.valueOf(charArr);
        anagram.computeIfAbsent(key,newKey->new ArrayList<>()).add(str);
       }
        return new ArrayList<>(anagram.values());
    }
}
