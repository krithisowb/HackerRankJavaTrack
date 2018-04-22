





import java.util.Arrays;


import java.util.Scanner;




public class Solution {




    public static String getSmallestAndLargest(String s, int k) {


        String smallest = "";



        String largest = "";



        


        String res[] = new String[s.length()-k+
];



        


        for (int i = 
; i < s.length(); i++) {



            


            if(i+k<=s.length()) {



                res[i] = s.substring(i, i+k);



                


                


            }



        }



        


        Arrays.sort(res);



        smallest=res[
];



     largest=res[res.length-
];






        return smallest + "\n" + largest;



    }






    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);



        String s = scan.next();



        int k = scan.nextInt();



        scan.close();






        System.out.println(getSmallestAndLargest(s, k));



    }



}

