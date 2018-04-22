

class MyCalculator {


    long power(int n,int p) throws Exception


    {


        long result=
;


        if(n<
 || p<
)


        {


            throw new Exception("n or p should not be negative.");



        }



        if(n==
 && p==
)



            throw new Exception("n and p should not be zero.");



        result=(long) Math.pow(n,p);



        return result;



        


    }



    


}
