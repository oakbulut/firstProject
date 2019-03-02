package hello;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangram {
    public Pangram() {
        super();
    }
    public static void main(String args[] ) throws Exception {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT */
            Scanner in = new Scanner(System.in);
            String s = in.nextLine(); 
            System.out.println(checkPangram(s));
    }
    
    public static String checkPangram(String s){
        Set<String> chrSet = new HashSet<String>();
        for(char ch : s.toLowerCase().toCharArray()){
            if(ch != ' '){
                chrSet.add(ch + "");
            }
        }
        return chrSet.size() == 26 ? "pangram" : "not pangram";
    }
}
