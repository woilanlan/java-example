package top.woilanlan.holding;

public class StackCollision {

    public static void show(){

        top.woilanlan.holding.Stack<String> stack = new top.woilanlan.holding.Stack<String>();
        for(String s : "My dog has fleas".split(" "))
            stack.push(s);
        while(!stack.empty())
            System.out.print(stack.pop() + " ");
        System.out.println();

        // 使用包名防止冲突
        java.util.Stack<String> stack2 = new java.util.Stack<String>();
        for(String s : "My dog has fleas".split(" "))
            stack2.push(s);
        while(!stack2.empty())
            System.out.print(stack2.pop() + " ");
    }
}
