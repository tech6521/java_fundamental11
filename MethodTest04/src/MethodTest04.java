import java.util.Scanner;

public class MethodTest04 {
	
	//�޼ҵ� ����
	public static void drowStar(int n) {
		
			//for��
			/*for(int i=1; i<=n; i++) {
				System.out.print("* ");
			}
			System.out.println();*/
			
			//while��
			/*int i = 1;
			while(i<=n) {
				System.out.print("* ");
				i++;
			}*/
			
			// do ~ while��
			int i=1;
			do {
				System.out.print("* ");
				i++;
			}
			while(i<=n);
			
		}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println(" -- �޼ҵ�� ������ ��ǥ �̱� -- ");
		System.out.print("�����Է� :");
		int n = sc.nextInt();
		
		//���1 - �޼ҵ�� ������ �ʾ�����
		/*for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}*/
		
		//���2 - �޼ҵ�� ����������
		for(int i=1; i<=n; i++) {
			drowStar(i);
			System.out.println();
		}
		
		sc.close();
	}

}
