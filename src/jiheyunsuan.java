import java.util.*;
public class jiheyunsuan {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//����������ȡ�����ֵ
		int n = sc.nextInt();
		int[] list1 = new int[n];
		for (int i = 0; i < list1.length; i++) {
			list1[i]= sc.nextInt();
		}
		int m = sc.nextInt();
		int[] list2 = new int[m];
		for (int i = 0; i < list2.length; i++) {
			list2[i]= sc.nextInt();
		}
		//���������б�����װ���
		ArrayList<Integer> jiaoji =new ArrayList<Integer>();
		ArrayList<Integer> bingji =new ArrayList<Integer>();
		ArrayList<Integer> buji =new ArrayList<Integer>();
		//��һ��ѭ��������list1
		for (int i = 0; i < list1.length; i++) {
			//�����͵�bu��ʾ��Ĭ��Ϊ�������list2��list1�е��༯
			boolean bu = true;
			//���bingji�в�����list1[i]��ֵ���ͼӵ�������ȥ
			if (!bingji.contains(list1[i])) {
				bingji.add(list1[i]);
			}
			for (int j = 0; j < list2.length; j++) {
				//���bingji�в�����list2[i]��ֵ���ͼӵ�������ȥ
				if (!bingji.contains(list2[j])) {
					bingji.add(list2[j]);
				}
				//�жϽ���
				if (list1[i]==list2[j]&&!jiaoji.contains(list1)) {
						jiaoji.add(list1[i]);
				}
				//�ж��༯
				if (list1[i]==list2[j]) {
					bu=false;
				}
			}
			//��������в�����������б�
			if (bu&&!buji.contains(list1[i])) {
				buji.add(list1[i]);
			}
		}
		//�б�����
		Collections.sort(jiaoji);
		Collections.sort(bingji);
		Collections.sort(buji);
		//�������
		for (int j = 0; j < jiaoji.size(); j++) {
			System.out.print(jiaoji.get(j)+" ");
		}
		if (jiaoji.size()!=0) {
			System.out.println();
		}
		for (int j = 0; j < bingji.size(); j++) {
			System.out.print(bingji.get(j)+" ");
		}
		if (bingji.size()!=0) {
			System.out.println();
		}
		for (int j = 0; j < buji.size(); j++) {
			System.out.print(buji.get(j)+" ");
		}
		
	}
}
