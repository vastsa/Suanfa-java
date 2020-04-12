import java.util.Scanner;

public class ³É¼¨ÅÅĞò2 {
	public static class student {
		public int math;
		public int engilsh;
		public int chinese;
		public int id;
		public int all;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		student[] student = new student[n];
		for (int i = 0; i < n; i++) {
			student[i] = new student();
			student[i].math = sc.nextInt();
			student[i].engilsh = sc.nextInt();
			student[i].chinese = sc.nextInt();
			student[i].id = i + 1;
			student[i].all = student[i].math+student[i].engilsh+student[i].chinese;
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n-i-1; j++) {
				if (student[j].all<student[j+1].all) {
					student temp = student[j];
					student[j] = student[j+1];
					student[j+1] = temp;
				}else if (student[j].all==student[j+1].all) {
					if (student[j].math<student[j+1].math) {
						student temp = student[j];
						student[j] = student[j+1];
						student[j+1] = temp;
					}else if (student[j].math == student[j+1].math) {
						if (student[j].engilsh<student[j+1].engilsh) {
							student temp = student[j];
							student[j] = student[j+1];
							student[j+1] = temp;
						}else if (student[j].engilsh==student[j+1].engilsh) {
							if (student[j].id>student[j+1].id) {
								student temp = student[j];
								student[j] = student[j+1];
								student[j+1] = temp;
							}
						}
					}
				}
			}
		}
		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i].math + " " + student[i].engilsh + " "
					+ student[i].chinese + " " + student[i].id);
		}
	}

}
