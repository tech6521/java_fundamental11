import java.util.Scanner;
public class Array03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" ******�л� ���� ó�� ���α׷�(�迭 Ȱ��)*******");
		System.out.printf("�л� �� �Է� :");
		int n = sc.nextInt();
		
		
		int[] st = new int[n];
		int sum=0;
		
		for(int i=0;i<st.length;i++) {
			System.out.printf((i+1) + "��° �л� ���� :");
			st[i] = sc.nextInt();
			sum+=st[i];
			System.out.println(i+1 + "���� �л��� ������" + st[i] + "�Դϴ�.");
		}
		System.out.println(st.length + "�� �������� �հ�: " + sum);
		System.out.println(st.length + "���� ������ ���: " + (double)sum/st.length);
	}

}
