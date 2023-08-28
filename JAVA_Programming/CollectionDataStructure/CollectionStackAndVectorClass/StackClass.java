package QueueCollection;

import java.util.Stack;

public class StackClass {
    public  static void main(String[]arg){
        Stack stack=new Stack<>();

        stack.add("ash");
        stack.add("johny");
        stack.add("meher");
        stack.add("mack");
        stack.add("oggy");
        stack.add("jack");
        stack.push("bob");

        stack.push("rah");
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        stack.push("rash");
        System.out.println( stack);

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.search("rohny"));
    }
}
