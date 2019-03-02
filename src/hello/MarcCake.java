package hello;

import java.math.BigInteger;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class MarcCake {
    
    public MarcCake() {
        super();
    }
    
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int[] calories = new int[n];
            for(int calories_i=0; calories_i < n; calories_i++){
                calories[calories_i] = in.nextInt();
            }
            // your code goes here
            HashMap<Integer, BigInteger> caloryMap = new HashMap<Integer, BigInteger>();
            BigInteger result = BigInteger.valueOf(0);
            Arrays.sort(calories);
            int j = 0;
            for(int i = calories.length - 1; i >= 0; i--){
                caloryMap.put(j, BigInteger.valueOf(calories[i]));
                j++;
            }
            int count = calories.length;
            for(int i = 0;i < count; i++){
                Integer order = new Integer(i);  
                long v =(long) Math.pow(2, i);
                result = result.add(caloryMap.get(order).multiply(BigInteger.valueOf(v)));
            }
            System.out.println(result);
    }
}
