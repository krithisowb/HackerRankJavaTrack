import java.util.BitSet;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		BitSet b1 = new BitSet(n);
		BitSet b2 = new BitSet(n);
		sc.nextLine();
		String s[] = new String[m];
		for (int y = 0; y < m; y++) {
			s[y] = sc.nextLine();
		}
		for (int y = 0; y < m; y++) {
			String [] st=s[y].split(" ");
		     int a=Integer.parseInt(st[1]);
		     int b=Integer.parseInt(st[2]);
		    
		     if(st[0].equals("AND"))
		     {
		    	 if(a==1)
		    		 b1.and(b2);
		    	 else if(a==2)
		    		 b2.and(b1);
		     }
		     else if(st[0].equals("OR"))
		     {
		    	 if(a==1)
		    		 b1.or(b2);
		    	 else if(a==2)
		    		 b2.or(b1);
		     }
		    	
		     else if(st[0].equals("XOR"))
		     {
		    	 if(a==1)
		    		 b1.xor(b2);
		    	 else if(a==2)
		    		 b2.xor(b1);
		     }
		     else if(st[0].equals("FLIP"))
		     {
		    	 if(a==1)
		    		 b1.flip(b);
		    	 else if(a==2)
		    		 b2.flip(b);
		     }
		    	
		     else if(st[0].equals("SET"))
		     {
		    	 if(a==1)
		    		 b1.set(b);
		    	 else if(a==2)
		    		 b2.set(b);
		     }
		    	
		     System.out.println(b1.cardinality()+" "+b2.cardinality());
		}

		sc.close();
	}

	
}
