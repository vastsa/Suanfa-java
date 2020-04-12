import java.util.*;

public class ³é¿¨ÓÎÏ· {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double p = sc.nextDouble();
		double k = sc.nextDouble();
		double sum = 0;
		for (int i = 1; i <= k-1; i++) {
			sum+=sum+getp(p,i);
			
		}
		double last = k*Math.pow(1-p, k-1);
		sum+=last;
		System.out.printf("%.2f",sum);
	}

	public static double getp(double p,int i){
		double sum = i*Math.pow(1-p, i-1)*p;
		return sum;
	}
}
