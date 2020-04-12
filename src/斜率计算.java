import java.util.*;

public class Ğ±ÂÊ¼ÆËã {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] list = new int[4];
		for (int i = 0; i < list.length; i++) {
			list[i] = sc.nextInt();
		}
		try {
			int result = (list[3]-list[1])/(list[2]-list[0]);
			System.out.println(result);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("INF");
		}
	}

}
