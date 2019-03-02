package hello;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindTwo {
    public FindTwo() {
        super();
    }
    
    public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           String s = in.next();
           //System.out.println(getResult(s));   
           System.out.println(printResult(s));
       }
       
       public static int getResult(String s){
           do{
               s = replaceChar(s);
               if(findDistinct(s).size() > 2){
                  s = findLeastOccurredChar(s);
               }
           }
           while(findDistinct(s).size() > 2 || !checkString(s));
           
           return (findDistinct(s).size() == 1 || findDistinct(s).size() == 0) ? 0 : s.length();
       }
       
        public static String printResult(String s){
            do{
                //s = replaceChar(s);
                // if(findDistinct(s).size() > 2){
                   s = findLeastOccurredChar(s);
                //}
            }
            while(findDistinct(s).size() > 2 || !checkString(s));
            
            return (findDistinct(s).size() == 1 || findDistinct(s).size() == 0) ? "" : s;
        }
       
       public static String replaceChar(String s){
           String newStr = s; 
               for(int i = 0; i < newStr.length() - 1; i++){
                   if(newStr.charAt(i) == newStr.charAt(i + 1)){
                       newStr = newStr.replaceAll(newStr.charAt(i) + "", "");
                        
                   }
               }
           return newStr;
       }
       
        public static Set<String> findDistinct(String s){
           Set<String> newSet = new HashSet<String>();
           for(char c : s.toCharArray()){
                   newSet.add("" + c);
           }
           return newSet;
       } 
        
        public static boolean checkString(String s){
            for(int i = 0; i < s.length() - 1; i++){
                if(s.charAt(i) == s.charAt(i + 1)){
                    return false;
                }
            }
            return true;
        }
        
        public static String findLeastOccurredChar(String s){
           HashMap<String, Integer> map = new HashMap<String, Integer>();
            int count = 0;
            String leastStr = "";
            Set<String> newSet = new HashSet<String>();
           for(int i = 0; i < s.length(); i++){
               int cTemp = 0;
               for(char c : s.toCharArray()){
                   if(s.charAt(i) == c ){
                       cTemp++;
                   }
               }               
               if(count > cTemp || count == 0){
                   count = cTemp;
                   if(i != 0 && (s.charAt(i - 1) != s.charAt(i + 1))){
                    leastStr = s.charAt(i) + "";
                   }
               }
               if(cTemp > 1 && i != s.length() - 1 && s.charAt(i) == s.charAt(i + 1)){
                   newSet.add(s.charAt(i) + "");
               }
               
               map.put(s.charAt(i) + "", cTemp);
               
           }
            if(findDistinct(s).size() > 2){
               s = s.replaceAll(leastStr, "") ;
            }
            for(String st : newSet){
                s = s.replaceAll(st, "");
            }
           return s;
        }
}
