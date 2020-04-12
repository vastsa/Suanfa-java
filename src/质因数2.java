import java.util.*;

public class ÖÊÒòÊý2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 2;
		int sum = 0;
		while (n > 1) {
			if (n % i == 0) {
				n /= i;
				sum++;
				System.out.print(i + " ");
			} else {
				i++;
			}
		}
		System.out.println("\n" + sum);
	}

}