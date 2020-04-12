import java.util.*;
public class ¼ÅÄ¯µÄÊı {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> result = yuan(n);
		for (int i = 0; i <= n; i++) {
			if (!result.contains(i)) {
				System.out.println(i);
			}
		}
	}
	public static List<Integer> yuan(int n){
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			String x = ""+i;
			int result = i;
			for (int j = 0; j < x.length(); j++) {
				result +=x.charAt(j)-'0';
			}
			list.add(result);
		}
		return list;
	}
}
