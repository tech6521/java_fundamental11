import java.util.Scanner;

public class Dowhile02 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int menu;
		
		do {
			System.out.println("1 - �޴�����");
			System.out.println("2 - ���� ����");
			System.out.println("3 - ���� �ޱ�");
			System.out.println("4 - ���� �ݱ�");
			System.out.print("�޴��� �����ϼ���.(1~4) :");
			menu = sc.nextInt();
			
		} while(!(menu>=1 && menu<=4));
		//while(menu < 1 || menu > 4);
		
		//System.out.println(menu + "�� �޴��� ���õǾ����ϴ�.");
		sc.close();
		
		switch(menu) {
			
		case 1:
			System.out.println("������ �����ϼ̽��ϴ�.");
			break;
		case 2:
			System.out.println("���Ͽ� ���⸦ �ϼ̽��ϴ�.");
			break;
		case 3:
			System.out.println("������ �����ϼ̽��ϴ�.");
			break;
		case 4:
			System.out.println("������ �ݾҽ��ϴ�.");
			break;
		}
	}
}
