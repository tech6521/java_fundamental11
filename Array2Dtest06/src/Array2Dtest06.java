import java.util.Scanner;

public class Array2Dtest06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] a = new int[4][5];
		String retry = null;
		do {
			System.out.printf("����� ��(1~45) :");
			int user = sc.nextInt();
			
			
			
			//2���� �迭�� ������ �����ؼ� ���� �� ���
			for(int i=0; i<a.length;i++) {
				for(int j=0; j<a[i].length;j++) {
					a[i][j] = (int) (Math.random() * 45) + 1;
					if(user == a[i][j]) {
						System.out.printf("%5d", a[i][j]);
					} else {
						System.out.printf("%5d", a[i][j]);
					}
					
				}
				
				System.out.println();
			}
			
			// ����� ���� 2���� �迭�� ��(����)�� ��
			int count = 0;
			
				for(int i=0; i<a.length;i++) {
					for(int j=0; j<a[i].length;j++) {
						if(user == a[i][j]) {
							++count;
						}
					}
				}
				
				//����� ���
				switch(count) {
				default: 
					System.out.println("��Ʈ�� ����� ���Դϴ�.");
					
					break;
				case 4: 
					System.out.println("����� ���Դϴ�.");
					break;
					
				case 3: 
					System.out.println("��� ������ ���Դϴ�.");
					break;
					
				case 2: 
					System.out.println("���� �������Դϴ�.");
					break;
					
				case 1: 
					System.out.println("������ ���Դϴ�.");
					break;
					
				case 0: 
					System.out.println("���� ���Դϴ�.");
					break;
				}
				
				System.out.println("���߽� ������" + count + "�Դϴ�.");
				System.out.println();
				System.out.print("�ѹ��� �Ͻðڽ��ϱ�?(y/n) :");
				
				retry = sc.next();
	} while(retry.equalsIgnoreCase("y"));
		
		
		sc.close();
		
	}
}



