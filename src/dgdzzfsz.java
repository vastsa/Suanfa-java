import java.util.*;
public class dgdzzfsz {

	/**
	 * @param args
	 * ���� �㷨��� �ݹ鵹���ַ�����
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] list = new char[n];
		String str = sc.next();
		//���ַ���¼���ַ�����
		for (int i = 0; i < str.length(); i++) {
			list[i] = str.charAt(i);
		}
		zhuanzhi(list,0,list.length-1);
	}
	
	static void zhuanzhi(char[] list,int i,int j){
		//�������Ϊ1��ֱ�ӷ���
		if (list.length==1) {
			System.out.println();
			System.out.println(list[0]);
		}else {
			//��β����
			if (i<list.length/2) {
				char temp = list[j];
				list[j]=list[i];
				list[i]=temp;
				System.out.println(list);
				i++;
				zhuanzhi(list,i,list.length-i-1);
			}else {
				System.out.println();
				System.out.println(list);
			}
		}
	}

}
