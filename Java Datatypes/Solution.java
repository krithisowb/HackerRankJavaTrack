import java.util.*;
import java.io.*;
class Solution{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        {
            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                    System.out.println("* byte");
                {
                  System.out.println("* short");  
                }
                {
                  System.out.println("* int");  
                }
                {
                  System.out.println("* long");  
                }
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
    }
}
