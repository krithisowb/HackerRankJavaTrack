

    import java.io.*;


    import java.util.*;


    import java.text.*;


    import java.math.*;


    import java.util.regex.*;




    public class Solution {




        public static void main(String[] args) {






            Scanner sc=new Scanner(System.in);



            int n=sc.nextInt();            



            String ans="";



            if(n%
==
){



              ans = "Weird";



            }



            else{



            if(n>=
 && n<=
)



            {



               ans = "Not Weird"; 



            }



                else if(n>=
 && n<=

)



                    ans="Weird";



                else if(n>

)



                ans="Not Weird";



            }



            System.out.println(ans);



            


        }



    }

