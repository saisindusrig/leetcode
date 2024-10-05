class MyQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
        
    }
    
    public void push(int x) {
        stack1.push(x);
        
    }
    
    public int pop() {
        while(!(stack1.isEmpty())){
            stack2.push(stack1.pop());

        }
        //stack1 emptied
        int rem = stack2.pop();
        while(!(stack2.isEmpty())){
            stack1.push(stack2.pop());
        }
        return rem;

    }
    
    public int peek() { 
        while(!(stack1.isEmpty())){
            stack2.push(stack1.pop());

        }
        //stack1 emptied
        int peek = stack2.peek();
        while(!(stack2.isEmpty())){
            stack1.push(stack2.pop());
        }
        return peek;
        
    }
    
    public boolean empty() {
        //check if its empty..
        //stack 1
        return stack1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */