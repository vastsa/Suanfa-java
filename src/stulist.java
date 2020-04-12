import java.util.*;
public class stulist {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList xy = new ArrayList();
		Scanner sc = new Scanner(System.in);
		int nums = sc.nextInt();
		for (int i = 0; i < nums; i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			for (int j = 0; j < n; j++) {
				xy.add(sc.nextInt(), sc);
				System.out.println(xy);
			}
		}
	}

}
