import java.text.DecimalFormat;
import java.lang.*;
import java.util.*;
public class sanjiaoxings {

	/**
	 * @param args
	 * 试题 算法提高 三角形面积
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		double a =sc.nextDouble();
		double b =sc.nextDouble();
		double c =sc.nextDouble();
		double s =(a+b+c)/2;
		System.out.printf("%.2f",Math.sqrt(s * ( s-a) * ( s - b ) * ( s-c)));
	}

}
