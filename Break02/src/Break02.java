import java.util.Scanner;
public class Break02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int sum=0;
		while(true) {
			System.out.println("���� �Է�(0�� �Է��ϸ� ����) : ");
			num = sc.nextInt();
		if(num==0) {
			break;
		}
			sum+=num;  //sum = sum+num
			
		}
		System.out.println("�Է��Ѱ��� �� :" + sum);
		}
	}


