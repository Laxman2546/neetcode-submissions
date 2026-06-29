class Solution {
    public boolean isValid(String s) {
        Stack<Character> sk = new Stack<>();
      char[] chArr = s.toCharArray();
      for(Character ch : chArr){
        if(!sk.isEmpty() && ((sk.peek()=='['&&ch == ']') ||(sk.peek()=='(' && ch==')')||(sk.peek()=='{'&&ch=='}'))){
            sk.pop();
        }else{
            sk.push(ch);
        }
      }
      return sk.isEmpty();  
    }
}
