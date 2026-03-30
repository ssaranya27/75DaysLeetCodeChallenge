class MyQueue {
    Queue<Integer> list=new LinkedList<>();
    public MyQueue() {
        list=new LinkedList<>();
    }
    
    public void push(int x) {
        list.offer(x);
    }
    
    public int pop() {
        return list.poll();
        
    }
    
    public int peek() {
        return list.peek();
    }
    
    public boolean empty() {
        if(list.isEmpty())
        return true;
        else
        return false;
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