class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())return false;
        char[] charArray1 = new char[s.length()];
        char[] charArray2 = new char[t.length()];
        for(int i=0;i<s.length();i++){
            charArray1[i] = s.charAt(i);
            charArray2[i] = t.charAt(i);
        }
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        for(int j=0;j<charArray1.length;j++){
            if(charArray1[j] != charArray2[j]){
                return false;
            }
        }
        return true;
    }
}
