package com.meritamerica.stacks;
import java.util.Scanner;

public class ScannerMain {
   public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
       int number = read.nextInt();
       int i = 0;
       while (i < number) {
           if ((number % 3 == 0) || (number % 10 == 3)) {
               System.out.println(number);
           }
           ++i;
       }   
   }
}