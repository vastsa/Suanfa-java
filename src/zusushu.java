import java.util.*;
public class zusushu {

	/**
	 * ×éËØÊı
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {1,9,4,9};
		int y =0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length; j++) {
				for (int j2 = 0; j2 < x.length; j2++) {
					for (int k = 0; k < x.length; k++) {
						if (i!=j&&i!=j2&&i!=k
								&&j!=j2&&j2!=k
								&&j!=k) {
							y = x[i]*1000+x[j]*100+x[j2]*10+x[k];
							if (!list.contains(y)) {
								list.add(y);
							}
						}
					}
				}
			}
		}
		System.out.println(list);
		int sum=0;
		for (int i = 0; i < list.size(); i++) {
			int o = list.get(i);
			boolean pd =true;
			for (int j = 2; j < o; j++) {
				if (o%j==0) {
					pd =false;
					break;
				}
			}
			if (pd==true) {
				sum++;
			}
		}
		System.out.println(sum);
		
	}

}
