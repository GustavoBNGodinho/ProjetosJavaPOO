package pilha;

import java.rmi.server.ExportException;

public class Main {
    public static void main(String[] args) {
       try {

           Stack<String> stack = new StackImpl<String>(5);
           stack.push("Hello");
           stack.push("World");
           stack.push("Java");
           stack.push("Programming");
           stack.push("Language");
           stack.push("pinto");
           System.out.println(stack);
       } catch (Exception e) {
           e.printStackTrace();
       }
    }
}
