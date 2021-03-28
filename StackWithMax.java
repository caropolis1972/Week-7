package com.meritamerica.stacks;
import java.util.*;
import java.io.*;

public class StackWithMax {
    class FastScanner {
        StringTokenizer tok = new StringTokenizer("");
        BufferedReader in;

        FastScanner() {
            in = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() throws IOException {
            while (!tok.hasMoreElements())
                tok = new StringTokenizer(in.readLine());
            return tok.nextToken();
        }
        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
    }

    public void solve() throws IOException {
        FastScanner scanner = new FastScanner();
        // Reads number of queries
        int queries = scanner.nextInt();
        // Declare the stack 
        Stack<Integer> stack = new Stack<Integer>();
        // Declare the auxiliary stack 
        Stack<Integer> auxiliar = new Stack<Integer>();
        int maxValue = 0;
        // Reads every query for a total of number of queries
        for (int qi = 0; qi < queries; ++qi) {
            
        	String operation = scanner.next();
            
        	if ("push".equals(operation)) {
        		// New entry in stack
                int value = scanner.nextInt();
                stack.push(value);
                
                if (value >= maxValue) {
                	maxValue = value;
                	auxiliar.push(value);
                }
              // extract entry from stack  
            } else if ("pop".equals(operation)) {
            	System.out.println("extract entry from stack" + stack);
                int value = stack.pop();
                
                if (value == maxValue) {
                	System.out.println("extract entry from auxiliar" + auxiliar);
                	auxiliar.pop();	
                }               		
                
            } else if ("max".equals(operation)) {
                System.out.println(auxiliar.lastElement());
            }
            
        }
    }

    static public void main(String[] args) throws IOException {
        new StackWithMax().solve();
    }
}
