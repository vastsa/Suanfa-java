import java.util.*;
public class Ææ±äµÄ×Ö·û´® {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] list = new char[str.length()];
		StringBuffer x= new StringBuffer();
		for (int i = 0; i < list.length; i++) {
			list[i] = str.charAt(i);
		}
		for (int i = 1; i < list.length; i+=2) {
			x.append(list[i]);
		}
		x.reverse();
		for (int i = 1,j=0; i < list.length; i+=2,j++) {
			list[i] = x.charAt(j);
		}
		for (char c : list) {
			System.out.print(c);
		}
	}

}
