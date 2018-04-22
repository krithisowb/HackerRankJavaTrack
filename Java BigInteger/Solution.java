

import java.math.BigInteger;


import java.util.Scanner;




public class Solution {




    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        BigInteger A = sc.nextBigInteger();


        BigInteger B = sc.nextBigInteger();



        BigInteger C=A.add(B);



        BigInteger D=A.multiply(B);



        System.out.println(C);



        System.out.println(D);



        sc.close();






    }



}
