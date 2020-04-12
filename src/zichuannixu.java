import java.util.*;
public class zichuannixu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		for (int i = str.length()-1; i >=0; i--) {
			char x = str.charAt(i);
			System.out.print(x);
		}
	}

}
