//import java.util.Random;
//import java.util.Scanner;
import java.util.*;

public class Array04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random(10);
		
		
		System.out.println("*** �ִ�, �ּڰ� ���ϴ� ���α׷� ***");
		
		int [] a = new int[10];
		
		
		// 1�� ��� - ������ ���� �Է�
		for(int i=0;i<a.length;i++) {
			System.out.println((i+1) +"��° ���� �Է�:");
			a[i] = sc.nextInt();
		}
		
		// 2�� ��� - ������ ������ ����
		/*System.out.print("[");
		for(int i=0; i<a.length;i++) {
			a[i] = r.nextInt(20);
			System.out.print(a[i] + ", ");
		}
		System.out.println("]");*/
		
		
		int max = a[0], min = a[0];
				
		for(int i=1;i<a.length;i++) {
			if (max < a[i]) {
				max = a[i];
			}
			
			if(min > a[i]) {
				min = a[i];
			}
		}	
			
		System.out.println(max);
		System.out.println(min);
			
	}

}
