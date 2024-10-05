// insertion is efficient here O(1)
// but removal is O(N)
class MyQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
        
    }
    
    public void push(int x) {
        while(!(stack1.isEmpty())){
            stack2.push(stack1.pop());
        }
        stack1.push(x);
        while(!(stack2.isEmpty())){
            stack1.push(stack2.pop());
        }
    }
    
    public int pop() {
       int pop = stack1.pop();
       return pop;
    }
    
    public int peek() { 
        int peeked =stack1.peek();
        return peeked;
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