package stackqueue;

import java.util.Stack;

/**
 * 用两个栈实现队列
 * 队列特性先进先出
 */
public class TwoStackQueue {
    private Stack<Integer> stackPut;
    private Stack<Integer> stackPop;

    public TwoStackQueue(){
        this.stackPut = new Stack<Integer>();
        this.stackPop = new Stack<Integer>();
    }

    public void pushPop(){
        if (stackPop.isEmpty()){
            while (!stackPut.isEmpty()){
                stackPop.push(stackPut.pop());
            }
        }
    }
    public void add(int newSum){
        stackPut.push(newSum);
        pushPop();
    }

    public int poll(){
        if (stackPut.isEmpty()&&stackPop.isEmpty()){
            throw new RuntimeException("your stack is empty");
        }
        pushPop();
        return stackPop.pop();
    }

    public int peek(){
        if (stackPut.isEmpty()&&stackPop.isEmpty()){
            throw new RuntimeException("your stack is empty");
        }
        pushPop();
        return stackPut.peek();
    }

    public static void main(String[] args) {
        TwoStackQueue twoStackQueue = new TwoStackQueue();
        twoStackQueue.add(1);
        twoStackQueue.add(2);
        twoStackQueue.add(3);
        twoStackQueue.add(4);
        twoStackQueue.add(5);
        System.out.println(twoStackQueue.poll());
        twoStackQueue.add(6);
        System.out.println(twoStackQueue.poll());

    }

}
