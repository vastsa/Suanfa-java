import java.util.*;
public class erfenfafind {

	/**
	 * @param args
	 * ���� �㷨��� ���ַ�����
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] n = new int[10];
		for (int i = 0; i < n.length; i++) {
			n[i]=sc.nextInt();
		}
		int find = sc.nextInt();
		for (int i = 0; i < n.length; i++) {
			if (n[i]==find) {
				System.out.println(i);
			}
		}
	}

}
