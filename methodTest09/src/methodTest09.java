import java.util.Arrays;
import java.util.Scanner;


public class methodTest09 {
	
	// 1�� ��� - 1���� ã���� �ٷ� �����ϴ� �˻��޼ҵ� (2�� �˻� �Ұ�)
	public static int linearSearch(int[] x, int k) {
			for(int i=0;i<x.length;i++) {
				if(k == x[i]) {
					return i;
					
				}
			}
			return -1;
	}
	
	// 2�� ��� - 2�� �̻� ã�������� ������ �˻� �޼ҵ�
	public static int linearSearch2(int[] x, int k) {
		int count=0;
		for(int i=0; i<x.length;i++) {
			if(x[i] == k) {
				System.out.print((i+1) + "��° ");
				++count;
			}
		}
		return count;
	}
	
	
	//�˻��� ���� ����
	public static int serch(int[] x, int k, int sum) {
		for(int i=0;i<x.length;i++) {
			if(k == x[i]) {
				sum++;
			}
		}
		return sum;
	}
	
	
	
	public static void main(String[] args) {
		int sum =0;
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("--- ���� �˻� ���α׷� ---");
		System.out.print("�迭�� ���� �Է� :");
		int n = sc.nextInt();
		
		
		
		
		
		System.out.print("�˻��� �� �Է�   :");
		int key = sc.nextInt();
		
		int [] a = new int[n];
		
		for(int i=0; i<n;i++) {
			a[i] = (int) (Math.random()*10) + 1;
		}
		
		System.out.println(Arrays.toString(a));
		
		
		
		
		//1�� ������� �޼ҵ� Ȱ��
		/*int findIdx = linearSearch(a, key);
		
		if(findIdx == -1) {
			System.out.println("�˻����� ���������ʽ��ϴ�.");
		} else {
			System.out.println("�˻��� ����" + (findIdx+1) + "��° �ֽ��ϴ�.");
		}
		System.out.println();
		
		sum = serch(a, key, sum);
		
		System.out.println("�˻��� ���� " + sum + "�� �ֽ��ϴ�.");*/
		
		
		//2�� ������� �޼ҵ� Ȱ��(2�� �̻�˻�)
		int count = linearSearch2(a, key);
		if(count ==0) {
			System.out.println("�˻��� ���� �������� �ʽ��ϴ�.");
		}else {
			System.out.println("�ֽ��ϴ�.\n�˻��� ����" + count + "�� �ֽ��ϴ�.");
		}
		
		
		
		sc.close();
	}

}
