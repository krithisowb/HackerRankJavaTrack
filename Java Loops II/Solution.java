

import java.util.Scanner;




class Solution {


    public static void main(String[] argh) {


        Scanner in = new Scanner(System.in);


        int t = in.nextInt();


        for (int i = 
; i < t; i++) {


            int a = in.nextInt();


            int b = in.nextInt();



            int n = in.nextInt();



            int res[] = new int[n];



            int sum = a;



            for (int j = 
; j < n; j++) {



                double q = Math.pow(
, j);



                int g = (int) (q * b);



                sum += g;



                res[j] = sum;



            }



            if(i==
){



              System.out.print(res[
]);  



            }



            else



            {



              System.out.print("\n"+res[
]);   



            }



            for (int p = 
; p < n; p++)



                System.out.print(" " + res[p]);



        }



        in.close();



    }



}
