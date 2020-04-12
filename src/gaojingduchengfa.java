import java.math.BigInteger;
import java.util.*;
public class gaojingduchengfa {

	/**
	 * @param args
	 * 高精度乘法
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BigInteger x = sc.nextBigInteger();
		BigInteger y = sc.nextBigInteger();
		BigInteger result = x.multiply(y);
		System.out.println(result);
	}

}
