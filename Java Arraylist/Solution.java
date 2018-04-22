

import java.util.ArrayList;


import java.util.Arrays;


import java.util.List;


import java.util.Scanner;




public class Solution {




    public static void main(String[] args) {


       Scanner sc=new Scanner(System.in);



       int n=sc.nextInt();



       List<List<String>>sin=new ArrayList<List<String>>();



       sc.nextLine();



       for(int i=
;i<n;i++)



       {



           List<String> sl=Arrays.asList(sc.nextLine().trim().split(" "));



           sin.add(sl);



       }



       int q=sc.nextInt();



       sc.nextLine();



       List<String> result=new ArrayList<String>();



       for(int i=
;i<q;i++)



       {



           String [] sinp=sc.nextLine().trim().split(" ");



           int x=Integer.valueOf(sinp[
]);



           int y=Integer.valueOf(sinp[
]);



           if(x-
<sin.size()) {



               if(y<sin.get(x-
).size())



               result.add(sin.get(x-
).get(y));



               else



                   result.add("ERROR!");



           }



           else



               result.add("ERROR!");



       }



       for(String res:result)



           System.out.println(res);



       sc.close();



    }



}
