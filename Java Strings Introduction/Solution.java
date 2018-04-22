

import java.io.*;


import java.util.*;




public class Solution {




    public static void main(String[] args) {


        

        Scanner sc=new Scanner(System.in);


        String A=sc.next();



        String B=sc.next();



        int a=A.length()+B.length();



       int l=A.compareTo(B);



       String result="No";



       if(l>
)



           result="Yes";



       


       System.out.println(a);



        System.out.println(result);



       System.out.println(A.substring(
,
).toUpperCase()+A.substring(
)+" "+B.substring(
,
).toUpperCase()+B.substring(
));



       


        sc.close();



        


    }



}




