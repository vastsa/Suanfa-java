import java.util.Scanner;


public class dxszh {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		for (int i = 0; i < str1.length(); i++) {
			char x = str1.charAt(i);
			if ((int)x>=65&&(int)x<=90) {
				int a = (int)x+32;
				char y = (char)a;
				System.out.print(y);
			}else if ((int)x>=97&&(int)x<=122) {
				int a = (int)x-32;
				char y = (char)a;
				System.out.print(y);
			}
		}
	}

}
