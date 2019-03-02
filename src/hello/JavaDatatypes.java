package hello;

import java.util.Scanner;

public class JavaDatatypes {
	public static void main(String []argh)
    {



        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                //Complete the code
                System.out.println("math.pow(2,3)= " + Math.pow(2, 3));
                System.out.println("Math.getExponent(3)= " + Math.getExponent(3));
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
