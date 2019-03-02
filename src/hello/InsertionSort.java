package hello;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class InsertionSort {
    
    

    public static void insertIntoSorted(int[] ar) {
        // Fill up this function  
        int length = ar.length;
        for(int i = length; i > 0; i--){
          printArray(ar);
          for(int j = 0; j < i; j++){
           if(j != 0 && ar[j] < ar[j - 1]){
               int temp = ar[j];
               ar[j] = ar[j-1];
               ar[j-1]=temp;
           }               
          }
         }
    }
    
    
    
    
/* Tail starts here */
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
    
    
}
