package hello;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindDigits {
    public FindDigits() {
        super();
    }
    
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int t = in.nextInt();
            List<Integer> arr = new  ArrayList<Integer>();
            for(int a0 = 0; a0 < t; a0++){
                int n = in.nextInt();
                char[] st = ("" + n).toCharArray();
                char[] chArr = new char[("" + n).length()]; 
                int count = 0;
                for(int c = 0; c < chArr.length; c++){
                    int a = Integer.parseInt(st[c] + "");
                    if(a!= 0 && n % a == 0){
                        count++;
                    }
                }
                arr.add(count);
            }
            for(int i = 0 ;i <  arr.size(); i++ ){
                System.out.println(arr.get(i));
            }            
    }
}
