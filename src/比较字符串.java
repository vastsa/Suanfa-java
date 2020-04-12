import java.util.Scanner;
public class ±È½Ï×Ö·û´® {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str1 =sc.next();
		String str2 =sc.next();
		if (str1.equals(str2)) {
			System.out.println(0);
		}else {
			for (int i = 0; i < str1.length(); i++) {
				char x = str1.charAt(i);
				char y = str2.charAt(i);
				if (x==y) {
					continue;
				}else {
					System.out.println((int)x-(int)y);
					break;
				}
			}
		}
	}

}
