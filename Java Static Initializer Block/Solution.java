


static int B;



static int H;



static boolean flag=true;






static{



  Scanner sc=new Scanner(System.in);



    B=sc.nextInt();



    H=sc.nextInt();



    if(B<=
 || H<=
){



    flag=false;



        System.out.println("java.lang.Exception: Breadth and height must be positive");



        }



    sc.close();



    }
