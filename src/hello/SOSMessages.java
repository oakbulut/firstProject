package hello;

import java.util.Scanner;

public class SOSMessages {
    public SOSMessages() {
        super();
    }
    
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String S = in.next();
            System.out.println( checkSOS(S));
    }
    
    public static int checkSOS(String s){
        int count = 0;
        //int numberOfMsg = s.length() % 3 + 1;
        for(int i = 0; i < s.length(); i++){
            if("SOS".charAt(i%3) != s.charAt(i)){
                count++;
            }
        }
        
        return count;
    }
    
}
