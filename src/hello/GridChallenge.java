package hello;

import java.util.Arrays;
import java.util.Scanner;

public class GridChallenge {
    public GridChallenge() {
        super();
    }
    
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int t = in.nextInt();
            int n = in.nextInt();
            String[] gridArr = new String[n];
            for(int grid_i=0; grid_i < n; grid_i++){
                gridArr[grid_i] = in.next();
            }
            for(int i = 0; i < n; i++){
               Arrays.sort(gridArr[i].toCharArray());
            
                if(checkOtherLines(gridArr)){
                    
                }
            }
            
    }
    
    public static boolean checkOtherLines(String[] arr){
        char[][] grid = new char[arr.length][arr.length];
        boolean bool = false;
        for(int i = 0; i < arr.length; i++){
            String st1 = arr[i];
            for(int j = 0; j < arr.length; j++){
                grid[i][j] = st1.toCharArray()[j];
            }
        }
        
        return bool;
    }
}
