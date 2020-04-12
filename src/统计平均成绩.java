import java.util.*;

public class 统计平均成绩 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double[][] grade = new double[5][4];
		for (int i = 0; i < grade[i].length; i++) {
			for (int j = 0; j < grade[j].length; j++) {
				grade[i][j]=sc.nextDouble();
			}
		}
		String[] result = new String[4];
		for (int i = 0; i < result.length; i++) {
			double sum =0;
			for (int j = 0; j < result.length; j++) {
				sum+=grade[j][i];
			}
			System.out.printf("%.2f",sum/4);
			System.out.println();
		}
	}

}