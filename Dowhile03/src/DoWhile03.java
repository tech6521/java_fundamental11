import java.util.Scanner;

public class DoWhile03 {
	public static void main(String[] args) {
		int month;
		String retry;
		Scanner sc = new Scanner(System.in);
		
	do {
		
		do {
		System.out.println("������ ǥ���մϴ�. �� �Է�(1-12)");
		month = sc.nextInt();
		} while(month < 1 || month > 12);
		switch(month) {
		case 3:	case 4:	case 5:
			System.out.println("���Դϴ�.");
			break;
		case 6:	case 7: case 8:
			System.out.println("�����Դϴ�.");
			break;
		case 9:	case 10: case 11:
			System.out.println("�����Դϴ�.");
			break;
		case 12: case 1: case 2:
			System.out.println("�ܿ��Դϴ�.");
			break;
		}
		
		
		System.out.println("�ٽ��ѹ� �Է��Ͻðڽ��ϱ�?(1-Y/2-N)");
		retry = sc.next();
	}while(retry.equalsIgnoreCase("y"));
	
	System.out.println("���� �Ǻ� ���α׷��� �����մϴ�.");
}
		
}
