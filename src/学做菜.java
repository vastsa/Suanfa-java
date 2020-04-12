import java.util.Scanner;
public class Ñ§×ö²Ë {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int[] result = new int[5];
		while (a>=2&&b>=1&&d>=2) {
			a-=2;b-=1;d-=2;
			result[0] +=1;
		}
		while (a>=1&&b>=1&&c>=1&&d>=1) {
			a-=1;b-=1;c-=1;d-=1;
			result[1] +=1;
		}
		while (c>=2&&d>=1) {
			c-=2;d-=1;
			result[2] +=1;
		}
		while(b>=3){
			b-=3;
			result[3]+=1;
		}
		while(a>=1&&d>=1){
			a-=1;d-=1;
			result[4]+=1;
		}
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

}
