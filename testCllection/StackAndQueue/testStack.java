package StackAndQueue;

import java.util.Stack;

/**
 * Author:QiyeSmart
 * Created:2019/5/21
 */
public class testStack {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<>();
        stack.push("aduo1");
        stack.push("aduo2");
        stack.push("aduo3");
        stack.push("aduo4");
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        //观察栈顶元素
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
