package hello;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EquilibriumIndices {
    public EquilibriumIndices() {
        super();
    }
    
    public static void main(String[] args) {
            
            int[] arr = new int[8];
            arr[0] = -1;
            arr[1] = 3; 
            arr[2] = -4;
            arr[3] = 5;
            arr[4] = 1; 
            arr[5] = -6;
            arr[6] = 2; 
            arr[7] = 1; 
            
            findIndice(arr);
    }
    
    public static void findIndice(int[] arr){
        
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++){
            int total1 = 0;
            int total2 = 0;
            for(int j = 0; j < i; j++){                
                total1 += arr[j];
            }
            for(int z = arr.length -1; z > i; z--){                
                total2 += arr[z];
            }
            if(total1 == total2){
                list.add(i);
                System.out.println(i);
            }            
            }
    }
}
