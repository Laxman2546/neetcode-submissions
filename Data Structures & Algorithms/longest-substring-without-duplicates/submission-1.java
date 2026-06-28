class Solution {
    public int lengthOfLongestSubstring(String s) {
       int left = 0;
       int right = 0;
       int max = 0;
       HashSet<Character> hs = new HashSet<>();
       while(right < s.length()){
            if(!hs.contains(s.charAt(right))){
                max = Math.max(max,(right - left) + 1);
                hs.add(s.charAt(right));
                right++;
            }else{
                hs.remove(s.charAt(left));
                left++;
            }
       }
       return max;
    }
}
