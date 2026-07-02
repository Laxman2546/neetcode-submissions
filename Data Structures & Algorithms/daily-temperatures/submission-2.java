class Solution {
    public int[] dailyTemperatures(int[] t) {
        Stack<Integer> sk = new Stack<>();
        int[] res = new int[t.length];
        for(int i=t.length-1;i>=0;i--){
            while(!sk.isEmpty() && t[i] >= t[sk.peek()]){
                sk.pop();
            }
            if(!sk.isEmpty()){
                res[i] = sk.peek() - i;
            }
            sk.push(i);
        }
        return res;
    }
}
