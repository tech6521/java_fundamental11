package holGame;

import java.util.*;

public class holGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int user=0;
		double money = 0; //���ñݾ�
		double userMoney =0; //����� �ݾ�
		double cho=0; //�����ݾ�
		
		
		
		
		
		String retry;
		
		do {
		
			while(cho<10000) {
				System.out.printf("�����ݾ�(10000������ ���������մϴ�.):");
				cho = sc.nextInt();
				
				if(cho < 10000) {
					System.out.println("10000�� �̻����� �������ּ���");
				} 
			}
		
			
			userMoney = cho + userMoney;
		
		
		do {
		System.out.println("****** Ȧ¦���� ******");
		
		System.out.printf("������ �ݾ��� �Է��ϼ���:");
		money = sc.nextInt();
		userMoney = userMoney-money;
		
		System.out.printf("*0=Ȧ,1=¦ ���Ǽ�����?");
		user = sc.nextInt();
		
		
		for(int i=0;i<=5;i++) {
			System.out.println(".");
		}
		
		
		int com = (int) (Math.random()*2); //Ȧ¦ �������� �����°�
		System.out.println("**************************");
		System.out.println("���ȸ����?" + com + "�Դϴ�(0= Ȧ,1= ¦)");
		System.out.println("**************************");
		
		if(user==com) {
			userMoney = userMoney + (money*1.97);
			System.out.println("�����ϼ̽��ϴ�. ���ϵ帳�ϴ�.");
		} else {
			System.out.println("������ ������ �� �ſ���");
		}
		
		
		
		System.out.println("���� �ݾ�:" + userMoney);
		
		System.out.println("�ѹ� �� �Ͻðڽ��ϱ�?(y/n) : ");
		retry = sc.next();
		} while(retry.equalsIgnoreCase("y"));
		
		System.out.println("�����Ͻðڽ��ϱ�?(y/n) : ");
		retry = sc.next();
		}while(retry.equalsIgnoreCase("y"));
		
		System.out.println("�����ϼ̽��ϴ�. Ȧ¦������ �����մϴ�.");
		
		sc.close();
	}

}
