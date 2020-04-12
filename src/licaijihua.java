import java.text.DecimalFormat;
import java.util.*;
public class licaijihua {

	/**
	 * @param args
	 * 试题 算法提高 理财计划
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		double money = sc.nextDouble();
		double temp =money;
		double month =sc.nextDouble();
		double lixi =sc.nextDouble();
		for (int i = 0; i < month; i++) {
			df.format(money+=temp+money*lixi);
		}
		System.out.println(df.format((money-temp*(month+1))));
	}

}
