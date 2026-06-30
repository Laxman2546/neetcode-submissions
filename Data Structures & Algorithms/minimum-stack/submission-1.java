class MinStack {
    Stack<Integer> sk;
    Stack<Integer> minSk;
    public MinStack() {
        sk  = new Stack<>();
        minSk = new Stack<>();
    }
    
    public void push(int val) {
        if(!minSk.isEmpty()){
            int current = Math.min(minSk.peek(),val);
            minSk.push(current);
        }else{
            minSk.push(val);
        }
        sk.push(val);
    }
    
    public void pop() {
       sk.pop();
       minSk.pop();
    }
    
    public int top() {
        return sk.peek();
    }
    
    public int getMin() {
        return  !minSk.isEmpty() ?minSk.peek() :-1;
    }
}
