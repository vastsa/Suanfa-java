import java.util.*;
public class sfzpaixu {

	/**
	 * @param args
	 * ���� �㷨��� ���֤����
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		String[]sfz = new String[n];
		//ѭ������
		for (int i = 0; i < sfz.length; i++) {
			sfz[i]=sc.next();
		}
		//����ð��������л���
		for (int i = 0; i < sfz.length; i++) {
			for (int j = 0; j < sfz.length-i-1; j++) {
				//�����֤�ַ����и���ղ�ǿתΪint
				long x = Long.valueOf(sfz[j].substring(6));
				long y = Long.valueOf(sfz[j+1].substring(6));
				if (x<y) {
					String temp = sfz[j];
					sfz[j]=sfz[j+1];
					sfz[j+1]=temp;
					System.out.println(sfz);
				}
			}
		}
		System.out.println(sfz);
	}

}
