import java.util.*;
public class fenshutongji {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=0,b=0,c=0,d=0,e=0;
		int n = sc.nextInt();
		int[]list = new int[n];
		for (int i = 0; i < list.length; i++) {
			list[i]=sc.nextInt();
		}
		ArrayList<Integer> result0 = new ArrayList<Integer>();
		ArrayList<Integer> result1 = new ArrayList<Integer>();
		ArrayList<Integer> result2 = new ArrayList<Integer>();
		ArrayList<Integer> result3 = new ArrayList<Integer>();
		ArrayList<Integer> result4 = new ArrayList<Integer>();
		
		for (int i = 0; i < list.length; i++) {
			if (list[i]<=100&&list[i]>=90) {
				result0.add(list[i]);
				a++;
			}else if (list[i]<=89&&list[i]>=80) {
				result1.add(list[i]);
				b++;
			}else if (list[i]<=79&&list[i]>=70) {
				result2.add(list[i]);
				c++;
			}else if (list[i]<=69&&list[i]>=60) {
				result3.add(list[i]);
				d++;
			}else if (list[i]<=59&&list[i]>=0) {
				result4.add(list[i]);
				e++;
			}
		}
		int []index = {a,b,c,d,e};
		for (int i = 0; i < index.length; i++) {
			System.out.print(index[i]+" ");
		}
		int temp=0,max=0;
		for (int i = 0; i < index.length; i++) {
			if (index[i]>temp) {
				temp = index[i];
				max = i;
			}
		}
		System.out.println("\n"+temp);
		if (max==0) {
			Collections.sort(result0);
			Collections.reverse(result0);
			for (int i = 0; i < result0.size(); i++) {
				System.out.print(result0.get(i)+" ");
			}
		}else if (max==1) {
			Collections.sort(result1);
			Collections.reverse(result1);
			for (int i = 0; i < result1.size(); i++) {
				System.out.print(result1.get(i)+" ");
			}
		}else if (max==2) {
			Collections.sort(result2);
			Collections.reverse(result2);
			for (int i = 0; i < result2.size(); i++) {
				System.out.print(result2.get(i)+" ");
			}
		}else if (max==3) {
			Collections.sort(result3);
			Collections.reverse(result3);
			for (int i = 0; i < result3.size(); i++) {
				System.out.print(result3.get(i)+" ");
			}
		}else if (max==4) {
			Collections.sort(result4);
			Collections.reverse(result4);
			for (int i = 0; i < result4.size(); i++) {
				System.out.print(result4.get(i)+" ");
			}
		}
	}

}
