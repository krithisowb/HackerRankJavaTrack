

import java.util.*;


import java.io.*;


class Solution{


    public static void main(String []args){


        Scanner sc = new Scanner(System.in);


        int t=sc.nextInt();


        for(int i=
;i<t;i++)


        {


            try



            {



                long x=sc.nextLong();



                System.out.println(x+" can be fitted in:");



                double a=Math.pow(
,
);



                double b=Math.pow(
,

);



                double c=Math.pow(
,

);



                double d=Math.pow(
,

);



                if(x>=(a*(-
)) && x<=(a-
))



                    System.out.println("* byte");



                  if(x>=(b*(-
)) && x<=(b-
))



                {



                  System.out.println("* short");  



                }



                  if(x>=(c*(-
)) && x<=(c-
))



                {



                  System.out.println("* int");  



                }



                  if(x>=(d*(-
)) && x<=(d-
))



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

