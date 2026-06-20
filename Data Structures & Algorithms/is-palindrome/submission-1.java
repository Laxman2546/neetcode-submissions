class Solution {
    public boolean isPalindrome(String s) {
        String l = s.toLowerCase().replaceAll(" ","");
        int left = 0;
        int right = l.length()-1;
        System.out.println(l);
        while(left < right){
            if(!Character.isLetterOrDigit(l.charAt(left))){
                left++;
            }else if(!Character.isLetterOrDigit(l.charAt(right))){
                right--;
            }else if(l.charAt(left) != l.charAt(right)){
                return false; 
            }else {
                left++;
                right--;
            }
        }
        return true;
    }
}
