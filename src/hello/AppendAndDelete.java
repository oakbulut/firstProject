package hello;

import java.util.Scanner;

public class AppendAndDelete {
    public AppendAndDelete() {
        super();
    }
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String s = in.next();
            String t = in.next();
            int k = in.nextInt();
            String temp = "";
            while(!s.equals(t)){
                int length = s.length();
                for(int i = 0; i < length; i++){
                    if(s.toCharArray()[i] == t.toCharArray()[i]){
                        temp += s.toCharArray()[i] + "";
                    }
                }
            }
    }
}
