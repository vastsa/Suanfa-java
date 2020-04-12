import java.util.*;
public class É¾³ıÖØ¸´ÔªËØ {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String x = sc.next();
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < x.length(); i++) {
			char a = x.charAt(i);
			boolean flag = true;
			for (int j = 0; j < x.length(); j++) {
				char b = x.charAt(j);
				if (j==i) {
					continue;
				}
				if (a==b) {
					flag=false;
					break;
				}
			}
			if (flag) {
				result.append(a);
			}
		}
		System.out.println(result.toString());
	}

}
