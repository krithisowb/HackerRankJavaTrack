

import java.util.Scanner;




public class Solution {




    public static void main(String[] args) {




        Scanner sc = new Scanner(System.in);


        String A = sc.next();


        StringBuffer sbBuffer = new StringBuffer(A);



        sbBuffer.reverse();



        String B = sbBuffer.toString();



        if (B.equals(A))



            System.out.println("Yes");



        else



            System.out.println("No");



        sc.close();






    }



}

