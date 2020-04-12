import java.util.*;
public class aefcq {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n =sc.nextLong();
		String x = ""+n;
		x = ""+n;
		
		while(x.length()!=1){		
			x = ""+n;
			n=1;
			for (int i = 0; i < x.length(); i++) {
				char z = x.charAt(i);
				int s = z-'0';
				if (s!=0) {
					n*=s;
				}
			}
		}
		System.out.println(n);
	}

}
