import java.util.*;
public class shuziheidong {

	/**
	 * @param args
	 * ���� �㷨��� ���ֺڶ�
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		int result=0,num=0;
		//���result������6174�Ͳ���ѭ��
		while(result!=6174){
			//�����ַ���תΪ���飬��������
			int[] list= new int[4];
			for (int i = 0; i < list.length; i++) {
				list[i] = n.charAt(i)-'0';
			}
			//��������
			Arrays.sort(list);
			//һ��Ϊ��Сֵ��һ��Ϊ���ֵ
			String zheng = "",ni="";
			//����������ѭ������������ֵ����
			for (int i = 0,j=list.length-1; i < list.length; i++,j--) {
				zheng+=""+list[i];
				ni +=""+list[j];
			}
			//��ֵ֮��
			result = Integer.parseInt(ni)-Integer.parseInt(zheng);
			//��������תΪ�ַ����������´�ѭ��
			n =result+"";
			//ѭ����������
			num++;
		}
		System.out.println(num);
	}
}
