import java.util.*;
public class qiuzhishu {

	/**
	 * @param args
	 * ���� �㷨ѵ�� 5-2��ָ��
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//��һ����N��
		int m = sc.nextInt();//�ڶ�����M��������
		int js=1,temp=n;//׼��һ������������һ����Ϊ������
		//ѭ������1��ʼ��M��
		for (int i = 0; i < m; i++) {
			//ѭ����һ��һ���̣�
			if (js<=5) {
				js++;
			}else {
				js=0;
				System.out.println();
			}
			System.out.print("            ");
			System.out.print(n);
			n*=temp;
		}
	}

}
