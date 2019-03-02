package hello;

import java.util.Scanner;

public class ReverseString {
    public ReverseString() {
        super();
    }
    
    public static void main(String[] args) {
            
            Scanner sc=new Scanner(System.in);
            String A=sc.next();
            /* Enter your code here. Print output to STDOUT. */
            String b = new StringBuilder(A).reverse().toString();
            if(A.equals(b)){
                System.out.println("Yes");
            }
        }
}
