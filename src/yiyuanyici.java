import java.text.DecimalFormat;
import java.util.*;
public class yiyuanyici {

	/**
	 * @param args
	 * 试题 算法提高 一元一次方程
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("0.00");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		String result = df.format(-(b/a));
		System.out.println(result);
	}

}
