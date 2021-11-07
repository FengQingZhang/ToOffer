package stackqueue;

import java.util.Stack;

/**
 * 使用递归函数和栈操作逆序一个栈
 * 一个栈依次压入1,2,3,4,5，
 * 那么从栈顶到栈底分别为5,4,3,2,1.
 * 将这个栈转置后，从栈顶到栈底为，1,2,3,4,5也就是实现栈中元素的逆序，
 * 但是只能使用递归函数来实现,不能使用其他数据结构
 */
public class reversionStack {

    /**
     * 此方法的效果为返回栈底的值，并移除它
     * @param stack
     * @return
     */
    public static int returnStackBottom(Stack<Integer> stack){
        int result = stack.pop();
        if (stack.isEmpty()){
            return result;
        }else {
            int last = returnStackBottom(stack);
            stack.push(result);
            return last;
        }
    }

    private static void reverse(Stack<Integer> stack){
        //临界条件
        if (stack.isEmpty()){
            return;
        }
        //获取栈底的元素
        int i = returnStackBottom(stack);
        //递归获取
        reverse(stack);
        //重新存放
        stack.push(i);
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
        reverse(stack);
        System.out.println(stack.toString());

    }
}
