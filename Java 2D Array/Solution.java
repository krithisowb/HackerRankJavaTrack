

import java.util.Scanner;




public class Solution {




    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);


        int arr[][] = new int[
][
];


        for (int i = 
; i < 
; i++) {


            for (int j = 
; j < 
; j++) {



                arr[i][j] = in.nextInt();



            }



        }



        int sum = -



;






        for (int z = 
; z <= 
; z++) {






            for (int p = 
; p <= 
; p++) {



                int temp = 
;



                for (int q = z; q <= z + 
; q++) {



                    for (int r = p; r <= p + 
; r++) {



                        if (q == z + 
) {



                            if (r == p + 
) {






                                temp += arr[q][r];



                            }






                        } else {






                            temp += arr[q][r];



                        }






                    }






                }






                if (temp > sum)



                    sum = temp;



            }






        }



        System.out.println(sum);



        in.close();



    }



}
