import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solution {
	public static void main(String[] argh) {
		Map<String, Integer> m = new HashMap<String, Integer>();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		for (int i = 0; i < n; i++) {
			String name = in.nextLine();
			int phone = in.nextInt();
			m.put(name, Integer.valueOf(phone));
			in.nextLine();
		}
		while (in.hasNext()) {
			String s = in.nextLine();
			if(m.containsKey(s))
			System.out.println(s+"="+m.get(s));
			else
				System.out.println("Not found");
		}
		in.close();
	}
}
