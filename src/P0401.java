import java.util.Scanner;


public class P0401 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n = scanner.nextInt();
		int result = 0;
		String str1 = ""+Integer.toBinaryString(n);
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i)=='1') {
				result++;
			}
		}
		System.out.println(result);
	}

}
