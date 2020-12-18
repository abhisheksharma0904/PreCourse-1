class MyStack {

    /** Initialize your data structure here. */
    Node head;
    class Node{
        int val; 
        Node next;
        public Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }
    public MyStack() {
        head = new Node(-1, null); 
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        Node newNode = new Node(x, head); 
        head = newNode; 
        
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
       if(head.val != -1){
           int result = head.val;
           head = head.next;
           return result;
       }
       return -1;
    }
    
    /** Get the top element. */
    public int top() {
       return head.val;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return head.val == -1;
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
