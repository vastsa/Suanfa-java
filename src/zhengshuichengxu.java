import java.text.DecimalFormat;
import java.util.*;
public class zhengshuichengxu {

	/**
	 * @param args
	 * 试题 算法提高 征税程序
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double xse = sc.nextDouble();
		double sl = sc.nextDouble();
		DecimalFormat df = new DecimalFormat("0.00");
		String result = df.format(xse*sl);
		System.out.println(result);
	}

}
