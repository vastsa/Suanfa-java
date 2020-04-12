import java.text.DecimalFormat;
import java.util.*;
public class yuanmianji {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("0.0000000000");
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		double p = Math.PI;
		String s = df.format(p*r*r);
		System.out.print(s+"        ");
		String b = df.format(4*r*r*p);
		System.out.print(b+"       ");
		String t = df.format((4*p*r*r*r)/3);
		System.out.print(t+"        ");
	}

}
