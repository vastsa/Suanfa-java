import java.util.*;
public class 求圆面积表面积体积 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		double p = 3.1415926536;
		System.out.printf("%.10f",n*n*p);
		System.out.print("\t");
		System.out.printf("%.10f",4*n*n*p);
		System.out.print("\t");
		System.out.printf("%.10f",p*n*n*n*4/3);
	}

}
