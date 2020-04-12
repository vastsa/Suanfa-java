import java.text.DecimalFormat;
import java.util.*;
public class yuceshengao {

	/**
	 * @param args
	 * 试题 算法训练 预测身高
	 * 你能看见你未来的样子吗？显然不能。但你能预测自己成年后的身高，有公式：
　　	 * 男孩成人后身高=（父亲身高+母亲身高）/2*1.08
　　	 * 女孩成人后身高=(父亲身高*0.923+母亲身高）/2
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sex = sc.nextInt(); //性别
		double height_father = sc.nextDouble(); //父亲身高
		double height_mother = sc.nextDouble(); //母亲身高
		DecimalFormat df = new DecimalFormat("0.000");
		String result = df.format((float)5/6);
		if (sex==0) {//女孩
			result = df.format((float)(height_father*0.923+height_mother)/2);
		}else {//男孩
			result = df.format((float)(height_father+height_mother)/2*1.08);
		}
		System.out.println(result);
	}

}
