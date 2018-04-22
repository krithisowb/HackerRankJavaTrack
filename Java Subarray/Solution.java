

import java.util.Arrays;


import java.util.Scanner;




public class Solution {




    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();


        int a[] = new int[n];



        int res = 
;






        for (int p = 
; p < n; p++) {



            a[p] = sc.nextInt();






        }






        for (int i = 
; i < n; i++) {



            for (int j = i + 
; j <= n; j++) {



                int b[] = Arrays.copyOfRange(a, i, j);






                int sum = 
;



                for (int y = 
; y < b.length; y++) {






                    sum += b[y];






                }



                if (sum < 
)



                    res++;






            }






        }






        System.out.println(res);



        sc.close();



    }



}
