import java.util.*;

public class ³É¼¨ÅÅĞò {
	public static class student {
		public int math;
		public int engilsh;
		public int chinese;
		public int id;
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
		}
		for (int i = 0; i < student.length; i++) {
			for (int j = i; j < student.length; j++) {
				if (student[i].math < student[j].math) {
					student temp = student[i];
					student[i] = student[j];
					student[j] = temp;
				}else if (student[i].math==student[j].math) {
					if (student[i].engilsh<student[j].engilsh) {
						student temp = student[i];
						student[i] = student[j];
						student[j] = temp;
					}else if (student[i].engilsh==student[j].engilsh) {
						if (student[i].chinese<student[j].chinese) {
							student temp = student[i];
							student[i] = student[j];
							student[j] = temp;
						}else if (student[i].chinese==student[j].chinese) {
							if (student[i].id>student[j].id) {
								student temp = student[i];
								student[i] = student[j];
								student[j] = temp;
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
