package com.meritamerica.stacks;
// Java code to illustrate get() method
import java.util.Stack;
  
public class StackDemo {
    public static void main(String args[])
    {
  
        // Creating an empty Stack
        Stack<String> stack = new Stack<String>();
  
        // Use add() method to add elements in the Stack
        stack.add("1");
        stack.add("2");
        stack.add("3");
        stack.add("10");
        stack.add("20");
  
        // Displaying the Stack
        System.out.println("Stack: "
                           + stack);
  
        // Fetching the specific element from the Stack
        System.out.println("The element is: "
                           + stack.get(4));
        	  
            // Creating an empty Stack
            Stack<String> stackStrings = new Stack<String>();
      
            // Use add() method to add elements in the Stack
            stackStrings.add("Geeks");
            stackStrings.add("for");
            stackStrings.add("Geeks");
            stackStrings.add("10");
            stackStrings.add("20");
      
            // Displaying the Stack
            System.out.println("Stack: " + stackStrings);
      
            // Fetching the specific element from the Stack
            System.out.println("The element is: "
                               + stackStrings.get(2));
 
         // Creating an empty Stack
         // Stack<String> stack = new Stack<String>();
      
            // Use add() method to add elements into the Stack
            stack.add("Welcome");
            stack.add("To");
            stack.add("Geeks");
            stack.add("4");
            stack.add("Caro");
      
            // Displaying the Stack
            System.out.println("Stack: " + stack);
      
            // Displaying the last element
            System.out.println("The last element is: "
                               + stack.lastElement());
            
         // Displaying the Stack
            System.out.println("Stack: " + stack);
            String str = stack.pop();
            
            System.out.println(str);
         // Displaying the Stack
            System.out.println("Stack: " + stack);
            
        
    }
}