import java.util.*;
public class days {

	/**
	 * @param args
	 * ���� �㷨ѵ�� ��������
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();  //�������
		int month = sc.nextInt(); //�����·�
		int days = sc.nextInt();//�����죬���㵽���
		//��һ�¿�ʼѭ��,����Ϊֹ
		for (int i = 1; i < month; i++) {
			//�ж��·�����
			switch (i) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				days+=31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				days+=30;
				break;
			case 2:
				if (year%4==0&&year%100!=0||year%400==0) {
					days+=29;
				}else {
					days+=28;
				}
				break;
			}
		}
		System.out.println(days);
	}

}
