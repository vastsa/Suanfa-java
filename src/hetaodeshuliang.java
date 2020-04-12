import java.util.Scanner;
public class hetaodeshuliang {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		int b =sc.nextInt();
		int c =sc.nextInt();
		for (int i = 1; i < 300; i++) {
			if (i%a==0&&i%b==0&&i%c==0) {
				System.out.println(i);
				break;
			}
		}
	}

}
