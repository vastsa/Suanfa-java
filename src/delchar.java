import java.util.*;
public class delchar {

	/**
	 * @param args
	 * ���� �㷨ѵ�� �ַ�ɾ��
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String str = sc.next();
		String x = sc.next();
		str = str.replaceAll(x,"");
		System.out.println(str);
	}
}
