import java.math.BigInteger;
import java.util.*;

public class jcjs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		BigInteger bi=new BigInteger("1");
		for(int i=2;i<=n;i++){
            bi=bi.multiply(new BigInteger(String.valueOf(i)));
        }
        System.out.println(bi);
	}

}
