import java.util.*;
public class 林丹大战李宗伟 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] list = new int[2];
		while(true){
			int n = sc.nextInt();
			if (n==1) {
				list[1]++;
			}else{
				list[0]++;
			}
			if (Math.abs(list[0]-list[1])>1&&((list[0]>20||list[1]>20))) {
				break;
			}
		}
		if (list[0]<list[1]) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}

}
