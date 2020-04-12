import java.util.Scanner;


public class jiafa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []x =GetTwoInts();
		System.out.println(x[0]+x[1]);
	}

	private static int[] GetTwoInts() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] x=new int[2];
		x[0] = sc.nextInt();
		x[1] = sc.nextInt();
		return x;
	}

}
