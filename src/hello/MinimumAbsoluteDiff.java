package hello;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MinimumAbsoluteDiff {
    
    public MinimumAbsoluteDiff() {
        super();
    }

    static int minimumAbsoluteDifference(int n, int[] arr) {
        // Complete this function
        int diff = 0;
        int result = 0;
        int temp = 0;
        /* for(int i = 0; i < n - 1; i++){
          if(arr[i] > arr[i+1]) {
                
                temp = arr[i+1];
                arr[i+1] = arr[i];
                arr[i] = temp; 
            }            
        } */
        Arrays.sort(arr);
        for(int i = 0; i < n - 1; i++){
            System.out.println(arr[i]);
        }
        
        for(int i = 0; i < n - 1; i++){
            diff = Math.abs(arr[i] - arr[i+1]);
            if(diff < result || i == 0){
                result = diff;
            }
        }
       
        
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = minimumAbsoluteDifference(n, arr);
        System.out.println(result);
        //arr = minimumAbsoluteDifference(n, arr);
    
        
        in.close();
    }
}
