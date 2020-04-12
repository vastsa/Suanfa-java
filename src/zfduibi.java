import java.util.Scanner;


public class zfduibi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		String text1 = sc.next();
		String text2 = sc.next();
		if (text1.length()==text2.length()) {
			if (text1.equals(text2)) {
				System.out.println('2');
			}else if (text1.equalsIgnoreCase(text2)) {
				System.out.println('3');
			}else if (text1!=text2) {
				System.out.println('4');
			}
		}else {
			System.out.println('1');
		}
	}

}
