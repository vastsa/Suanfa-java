import java.util.*;
public class pukepai {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int[] arr = new int[5]; //ษ๙ร๗สýื้
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		if (arr[0]==arr[1]||arr[0]==arr[1]+1
				&&arr[1]>arr[2]||arr[1]>arr[2]+1
					&&arr[2]>arr[3]||arr[2]>arr[3]+1
						&&arr[3]>arr[4]||arr[3]>arr[4]+1) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}

}
