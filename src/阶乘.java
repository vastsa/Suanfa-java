import java.util.*;
public class ½×³Ë {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long x = n;
		for (int i = n-1; i >0; i--) {
			x*=i;
			if (x%10==0) {
				x/=10;
				x%=1000;
			}
		}
		x%=10;
		System.out.println(x);
	}

}
