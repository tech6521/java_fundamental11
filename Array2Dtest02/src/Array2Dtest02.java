import java.util.Random;
import java.util.Scanner;
public class Array2Dtest02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		
		System.out.println("��� �Է� :");
		int h = sc.nextInt();
		System.out.println("���� �Է� :");
		int w = sc.nextInt();
		
		int[][] a = new int[h][w];
		
		for(int i=0;i<h;i++) {
			for(int j=0;j<w;j++) {
				a[i][j] = (int) (Math.random()*90)+10;// �� �ڸ��� ���� ����
			}
		}
		
		for(int i=0;i<h;i++) {
			for(int j=0;j<w;j++) {
				System.out.printf("%3d", a[i][j]); 
			}
			System.out.println();
		}
			sc.close();
	}
	
}
