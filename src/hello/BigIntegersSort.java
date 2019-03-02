package hello;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Arrays;
import java.util.Collections;

public class BigIntegersSort {

/*     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] unsorted = new String[n];
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
            unsorted[unsorted_i] = in.next();
        }
        BigIntegersSort.sortNumbers(unsorted);
        
        
        // your code goes here
    } */
    
    public static void sortNumbers(String[] unsorted){
        List<BigInteger> sorted = new ArrayList<BigInteger>();
        int i = 0;
        for(String st : unsorted){
            BigInteger b = new BigInteger(st);
            sorted.add(b);
            i++;
        }
        Collections.sort(sorted);
        for(BigInteger st : sorted){
            System.out.println(st);
        }
    }
    
        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            BigInteger[] array = new BigInteger[n];
            
            for(int i = 0; i < n; i++){
                array[i] = in.nextBigInteger();
            }
            BigIntegersSort.getIndice(array);
            for(int i = 0; i < n; i++){
                System.out.println(array[i]);
            }
        }
        
        public static BigInteger[] getIndice(BigInteger[] arr){
            BigInteger temp = BigInteger.valueOf(0);
            for(int i = 1; i < arr.length ; i++){
                for(int j = 1; j < arr.length ; j++){
                    if(arr[j].compareTo(arr[j-1]) == -1 ){
                        temp = arr[j];
                        arr[j] = arr[j-1];
                        arr[j-1] = temp;
                    }             
            }
            }
            
            return arr;
        }
}
