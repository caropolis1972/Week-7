package com.meritamerica.stacks;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;



class CheckBracketsBalanced {
    char type;
    int position;
	
	CheckBracketsBalanced(char type, int position) {
        this.type = type;
        this.position = position;
    }

    public boolean match(char c) {
        if (this.type == '[' && c == ']')
            return true;
        if (this.type == '{' && c == '}')
            return true;
        if (this.type == '(' && c == ')')
            return true;
        return false;
    }

}
