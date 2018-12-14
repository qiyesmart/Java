public class TestStack {
    
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        
        stack.push("A");
        stack.push("B");
        stack.push("C");

//        Iterator<String> iterator = stack.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

//        System.out.println(stack.pop());
        System.out.println(stack.peek());
        
        //search base 1 栈顶元素位置：1 依次递增
        System.out.println(stack.search("A"));
        
        // 如果Stack是空的，EmptyStackException
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println("输出当前栈的数据：");
        for (String item : stack) {
            System.out.println(item);
        }
    }
}
