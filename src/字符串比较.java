import java.util.*;

public class ×Ö·û´®±È½Ï {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		int n = sc.nextInt();
		int result =0;
		for (int i = 0; i < n; i++) {
			int x = strncmp(s.charAt(i),t.charAt(i));
			if (x==1) {
				System.out.println(1);
				break;
			}else if (x==-1) {
				System.out.println(-1);
				break;
			}else {
				result++;
			}
		if (result==n) {
			System.out.println(0);
		}
		}
	}

	public static int strncmp(char s, char t) {
		if (s==t) {
			return 0;
		} else if (s < t) {
			return -1;
		} else if (s > t) {
			return 1;
		}
		return 2;
	}
}
