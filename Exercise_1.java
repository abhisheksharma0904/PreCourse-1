// 

class MyStack {

    /** Initialize your data structure here. */
    List<Integer> list;
    public MyStack() {
        list = new ArrayList<Integer>(); 
    }
    
    /** Push element x onto stack. */
    // TC - O(1)
    public void push(int x) {
        list.add(x);
    }
    
    /** Removes the element on top of the stack and returns that element. */
    // TC - O(1)
    public int pop() {
       return list.remove(list.size()-1); 
    }
    
    /** Get the top element. */
    // TC - O(1)
    public int top() {
       return list.get(list.size()-1);
    }
    
    /** Returns whether the stack is empty. */
    // TC - O(1)
    public boolean empty() {
        return list.size() == 0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
