package stackqueue;

import java.util.LinkedList;
import java.util.Stack;

/**
 * 用一个栈实现另一个栈的排序
 * 一个栈中元素的类型为整形，现在想将该栈从底按从大到小的顺序排列
 * 只能申请使用一个栈。
 */
public class StackSort {
    private Stack<Integer> tool;
    public StackSort(){
        this.tool = new Stack<>();
    }

    public void sortStack(Stack<Integer> stack){
       while (!stack.isEmpty()){
           int cur = stack.pop();
           //每次弹出比较
           while (!tool.isEmpty()&&tool.peek()<cur){
               stack.push(tool.pop());
           }
           //如果stack栈顶元素小于等于tool栈顶元素，
           tool.push(cur);
       }
       while (!tool.isEmpty()){
           stack.push(tool.pop());
       }
    }


}
