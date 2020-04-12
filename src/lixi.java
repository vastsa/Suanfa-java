import java.text.DecimalFormat;
import java.util.Scanner;


public class lixi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float money = sc.nextFloat();
		float lilv = sc.nextFloat();
		lilv *=0.01;
		String result = new DecimalFormat("0.00").format((float) (money + (money*lilv)*0.95));
		System.out.println(result);
		
	}

}
