package com.meritamerica.stacks;
public class ExpandableArrayProgram {
    public static void main (String args[]) {
    	
        ExpandableArray myList = new ExpandableArray();
       
        myList.set(14, "Bob");
     
        myList.set(21, "Sally");
        
        String value = (String) myList.get(21); // Note the cast
        if (value != null) {
            System.out.println("Got value: " + value);
        }
        
    }
}
