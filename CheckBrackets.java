package com.meritamerica.stacks;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class CheckBrackets {
    public static void main(String[] args) throws IOException {
        InputStreamReader input_stream = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input_stream);
        String text = reader.readLine();
        
        String output = "Sucess";
        Stack<CheckBracketsBalanced> opening_brackets_stack = new Stack<CheckBracketsBalanced>();
        for (int position = 0; position < text.length(); ++position) {
            char next = text.charAt(position);

            if (next == '(' || next == '[' || next == '{') {
                // Process opening bracket, write your code here
            	CheckBracketsBalanced item = new CheckBracketsBalanced(next, position);
            	opening_brackets_stack.push(item);         	
            } 
            if (next == ')' || next == ']' || next == '}') {
                // Process closing bracket, write your code here
            	// Check if stack is empty
            	if (opening_brackets_stack.empty()) {
            		System.out.println("unbalanced");
            		output = Integer.toString(++position);
            		break;
            	}
            	//
            	CheckBracketsBalanced item = opening_brackets_stack.pop();
            	if (!item.match(next)) { //true if balanced
            		System.out.println("unbalanced");
            		output = Integer.toString(++position);
            		break;
            	}            	
            }
        }

        // Printing answer, write your code here
        System.out.println(output);
    }
}