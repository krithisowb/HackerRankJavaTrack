

import java.util.BitSet;


import java.util.Scanner;




public class Solution {




    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();


        int m = sc.nextInt();



        BitSet b
 = new BitSet(n);



        BitSet b
 = new BitSet(n);



        sc.nextLine();



        String s[] = new String[m];



        for (int y = 
; y < m; y++) {



            s[y] = sc.nextLine();



        }



        for (int y = 
; y < m; y++) {



            String [] st=s[y].split(" ");



             int a=Integer.parseInt(st[
]);



             int b=Integer.parseInt(st[
]);



            


             if(st[
].equals("AND"))



             {



                 if(a==
)



                     b
.and(b
);



                 else if(a==
)



                     b
.and(b
);



             }



             else if(st[
].equals("OR"))



             {



                 if(a==
)



                     b
.or(b
);



                 else if(a==
)



                     b
.or(b
);



             }



                


             else if(st[
].equals("XOR"))



             {



                 if(a==
)



                     b
.xor(b
);



                 else if(a==
)



                     b
.xor(b
);



             }



             else if(st[
].equals("FLIP"))



             {



                 if(a==
)



                     b
.flip(b);



                 else if(a==
)



                     b
.flip(b);



             }



                


             else if(st[
].equals("SET"))



             {



                 if(a==
)



                     b
.set(b);



                 else if(a==
)



                     b
.set(b);



             }



                


             System.out.println(b
.cardinality()+" "+b
.cardinality());



        }






        sc.close();



    }






    


}

