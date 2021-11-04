package StackAndQueue;

import java.util.Stack;

/**
 * 实现一个getMin功能的栈
 */
public class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    public MinStack(){
        this.stack = new Stack<>();
        this.minStack = new Stack<>();
    }

    public void push(int param){
        if (stack.isEmpty()){
            minStack.push(param);
        }else if (param>minStack.peek()){
            minStack.push(minStack.peek());
        }else {
            minStack.push(param);
        }
        stack.push(param);


    }

    public int pop() throws Exception {
        if (stack.isEmpty()){
            throw new Exception("your stack is empty");
        }
        stack.pop();
       return minStack.pop();
    }

    public int getMin() throws Exception {
        if (minStack.isEmpty()){
            throw new Exception("");
        }
        return minStack.peek();
    }
}
