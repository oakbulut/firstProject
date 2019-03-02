package hello;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Hackerrank {
    public Hackerrank() {
        super();
    }
    
    public static boolean checkString(String s){
        //for(char ch : "hackern".toCharArray()){
        Set<String> chrSet = new HashSet<String>();
        chrSet.add("a");
        chrSet.add("k");
        chrSet.add("r");
            if(s.contains("h") && s.contains("a") && s.contains("c") && s.contains("k") && s.contains("r") && s.contains("n") && s.contains("h") && s.contains("e") &&
               (s.indexOf("h") < s.indexOf("a")) && (s.indexOf("a") < s.indexOf("c")) && (s.indexOf("c") < s.indexOf("k")) && (s.indexOf("k") < s.indexOf("e")) && 
               (s.indexOf("e") < s.indexOf("r")) && (s.indexOf("r") < s.lastIndexOf("a")) && (s.indexOf("r") < s.indexOf("n")) && (s.indexOf("n") < s.lastIndexOf("k"))){
                for(String ch : chrSet){
                    if((s.indexOf(ch + "") != s.lastIndexOf(ch + ""))){
                        return true;
                    }     
                }
            }else{
                return false;
            }
        //}
        return false;
    }
    
    private static String checkIfIsHacker(String s) {

            String str = "hackerrank";
            if (s.length() < str.length()) {
                return "NO";
            }
            int j = 0;
            for (int i = 0; i < s.length(); i++) {
                if (j < str.length() && s.charAt(i) == str.charAt(j)) {
                        j++;
                }
            }
            return (j == str.length() ? "YES" : "NO");

        }
    
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int q = in.nextInt();
            for(int a0 = 0; a0 < q; a0++){
                String s = in.next();
                // your code goes here
                /* if(checkString(s)){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                } */
                
                System.out.println(checkIfIsHacker(s));
            }
        }
}
