package hello;


import java.math.BigInteger;

import java.util.Scanner;

public class ExtraLongFactorial {
    public ExtraLongFactorial() {
        super();
    }
    
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            BigInteger b = BigInteger.valueOf(n);
            for(int i =1;i < n; i++){
                b = b.multiply(BigInteger.valueOf(i));
            }
            System.out.println(b);
    }
}
