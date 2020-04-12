import java.util.*;
public class FibonacciÊıÁĞ {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(digui(n));
	}
	static int digui(int n){
		if (n==1||n==2) {
			return 1;
		}else if (n==0) {
			return 0;
		}else{
			return ((digui(n-1)%10007+digui(n-2)%10007));
		}
		
	}
}
