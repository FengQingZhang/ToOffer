package StackAndQueue;

import java.util.Stack;

/**
 * 使用递归函数和栈操作逆序一个栈
 * 一个栈依次压入1,2,3,4,5，
 * 那么从栈顶到栈底分别为5,4,3,2,1.
 * 将这个栈转置后，从栈顶到栈底为，1,2,3,4,5也就是实现栈中元素的逆序，
 * 但是只能使用递归函数来实现,不能使用其他数据结构
 */
public class reversionStack {

    public static int returnStackBottom(Stack<Integer> stack){
        int result = stack.pop();
        if (stack.isEmpty()){
            return result;
        }else {

            return
        }
    }

    public static Stack<Integer> reversion(Stack<Integer> stack, Stack<Integer> nStack){
        if (stack.isEmpty()){
            return nStack;
        }
        nStack.push(stack.pop());
        return reversion(stack,nStack);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        Stack<Integer> stack1 =  reversion(stack,new Stack<Integer>());
        System.out.println(stack1);

    }
}
