import java.math.BigInteger;
import java.util.*;
public class budadeshu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BigInteger x =new BigInteger("2");
		BigInteger result =new BigInteger("2");
		for (int i = 0; i <= n; i++) {
			result = result.multiply(x);
		}
		System.out.println(result);
	}

}
