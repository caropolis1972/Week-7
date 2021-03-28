package com.meritamerica.stacks;
import java.util.*;
  
public class LinkedListTest {
  
    public static void main(String args[])
    {
        // Creating object of the
        // class linked list
        LinkedList<String> ll
            = new LinkedList<String>();
  
        // Adding elements to the linked list
        ll.add("A");
        ll.add("B");
        ll.addLast("C");
        System.out.println(ll);
        ll.addFirst("D");
        System.out.println(ll);
        ll.add(2, "E");
  
        System.out.println(ll);
  
        ll.remove("B");
        System.out.println(ll);
        ll.remove(3);
        System.out.println(ll);
        ll.removeFirst();
        System.out.println(ll);
        ll.removeLast();
  
        System.out.println(ll);
    }
}