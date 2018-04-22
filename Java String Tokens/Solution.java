

import java.io.*;


import java.util.*;




public class Solution {




    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);


        String s = scan.nextLine();


        String g[]=s.trim().split("[ !,?._'@]+");



        if(s == null || s.equals("") || s.trim().equals("")){



       System.out.println("
");



    }



    else if(s.length() > 





){



        return;



    }



    else{



       


    





        System.out.println(g.length);



        for(String h:g)



             System.out.println(h);



        }



        scan.close();



    }



}

