import java.util.*;

public class P0104 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double x = b * b - 4 * a * c;
		if (x < 0) {
			System.out.println("Error");
		} else if (x == 0) {
			double result = (-b - Math.sqrt(x)) / (2 * a);
			System.out.printf("x1 = %.6f \n",result);
		} else {
			double result1 = (-b + Math.sqrt(x)) / (2 * a);
			double result2 = (-b - Math.sqrt(x)) / (2 * a);
			System.out.printf("x1 = %.6f \n",result1);
			System.out.printf("x2 = %.6f",result2);
		}
	}

}
