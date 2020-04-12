import java.util.*;
public class Ъ§Са {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double k = sc.nextDouble();
		int n = sc.nextInt();
		int sum =0;
		int m,i=0;
		while(n>0){
			m=n%2;
			sum+=m*Math.pow(k, i);
			i++;
			n/=2;
		}
		System.out.println(sum);
	}

}
