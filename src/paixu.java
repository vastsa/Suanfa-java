import java.util.*;
public class paixu {

	/**
	 * @param args
	 *  ‘Ã‚ À„∑®—µ¡∑ ≈≈–Ú
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int[] s= new int[3];
		for (int i = 0; i < s.length; i++) {
			s[i]=sc.nextInt();
		}
		Arrays.sort(s);
		for (int i = s.length-1; i >=0 ; i--) {
			System.out.print(s[i]+ " ");
		}
	}

}
