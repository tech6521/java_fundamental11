import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("****����ó�����α׷�****");
		System.out.println("�л��� ����Դϱ�?");
		int n = sc.nextInt();
		
		String[] name= new String[n];
		int[] num = new int[n];
		
		
		for(int i=0;i<name.length;i++) {
			
			System.out.printf(i+1 + "��°" + "�л��̸�: ");
			name[i] = sc.next();
			System.out.println();
			
			
		}
		for(int i=0;i<name.length;i++) {
		System.out.println(name[i]);
		}
		
	
	}

}
