import java.text.DecimalFormat;
import java.util.*;
public class yuceshengao {

	/**
	 * @param args
	 * ���� �㷨ѵ�� Ԥ�����
	 * ���ܿ�����δ������������Ȼ���ܡ�������Ԥ���Լ���������ߣ��й�ʽ��
����	 * �к����˺����=���������+ĸ����ߣ�/2*1.08
����	 * Ů�����˺����=(�������*0.923+ĸ����ߣ�/2
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sex = sc.nextInt(); //�Ա�
		double height_father = sc.nextDouble(); //�������
		double height_mother = sc.nextDouble(); //ĸ�����
		DecimalFormat df = new DecimalFormat("0.000");
		String result = df.format((float)5/6);
		if (sex==0) {//Ů��
			result = df.format((float)(height_father*0.923+height_mother)/2);
		}else {//�к�
			result = df.format((float)(height_father+height_mother)/2*1.08);
		}
		System.out.println(result);
	}

}
