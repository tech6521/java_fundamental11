import java.util.Scanner;

public class go {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		
		System.out.printf("�л��� ����Դϱ�? :");
		int n = sc.nextInt();
		
		String[] name = new String[n];
		int[] guk = new int[n];
		int[] su = new int[n];
		int[] en = new int[n];
		double[] sum = new double[n];
		double[] avg = new double[n];
		String[] table = new String[7];
		int[][] student = new int[n][7];
		
		table[0] = "����";
		table[1] = "�̸�";
		table[2] = "��������";
		table[3] = "��������";
		table[4] = "��������";
		table[5] = "�հ�";
		table[6] = "���";
			
		for(int i=0;i<table.length;i++) {
			 System.out.printf(table[i] + "    ");
		}
		
		System.out.println();
		
		for(int i=0;i<student.length;i++) {
			student[i][0] = i+1;
			student[i][i] = 1;
			System.out.println(student[i][i]);
		}
		
		
		
		
		
		
		
		
		System.out.println("****���� ��� ���α׷�****");
		
		for(int i=0;i<=3;i++) {
		System.out.println();
		}
		
		
		for(int i=0;i<n;i++) {
			System.out.println("�̸��� �Է��ϼ���");
			name[i] = sc.next();
			
			if(guk[i] > 100 || su[i] > 100 || en[i] > 100) {
				System.out.println("�ٽ��Է����ּ���");
			}else {
				System.out.println();
				System.out.println(name[i] + "���� ���������� �Է����ּ���");
				guk[i] = sc.nextInt();
				
				System.out.println(name[i] + "���� ���������� �Է����ּ���");
				su[i] = sc.nextInt();
				
				System.out.println(name[i] + "���� ���������� �Է����ּ���");
				en[i] = sc.nextInt();
			}
		
			sum[i] = (double) guk[i] + su[i] + en[i];
			avg[i] = sum[i]/3;
		}
		
		
		
		for(int i=0;i<n;i++) {
			System.out.println(name[i] + "�� ������");
			
			System.out.println("����: " + guk[i] + "�Դϴ�.");
			System.out.println("����: " + su[i] + "�Դϴ�.");
			System.out.println("����: " + en[i] + "�Դϴ�.");
			System.out.println("�հ�: " + sum[i] + " ���: " + avg[i] + " �Դϴ�.");
		}
		
		
		
		
		
	}
	
	
}
