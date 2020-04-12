import java.text.DecimalFormat;
import java.util.*;
public class wenduzhuanhuan {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		double input = sc.nextDouble();
		String result = df.format(input*1.8+32);
		System.out.println(result);
	}

}
