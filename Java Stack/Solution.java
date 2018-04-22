

import java.util.Scanner;


import java.util.Stack;




class Solution {




    public static void main(String[] argh) {


        Scanner sc = new Scanner(System.in);




        while (sc.hasNext()) {



            String input = sc.next();



            System.out.println(checkBalancedParanthesis(input) ? "true" : "false");



        }



        sc.close();



    }






    private static boolean checkBalancedParanthesis(String input) {



        Stack<Character> stc = new Stack<Character>();



        for (int i = 
; i < input.length(); i++) {



            char c = input.charAt(i);



            if (c == '{' || c == '[' || c == '(') {



                stc.push(c);



            }



            else if(c==']')



            {



                if(stc.isEmpty() || stc.pop()!='[')



                    return false;



            }



            else if(c=='}')



            {



                if(stc.isEmpty() || stc.pop()!='{')



                    return false;



            }



            else if(c==')')



            {



                if(stc.isEmpty() || stc.pop()!='(')



                    return false;



            }



        }



        return stc.isEmpty();



    }



}

