
public class Array2Dtest04 {
	public static void main(String[] args) {
		
		//2���� �迭�� ����� �ʱ�ȭ
		int[][] a = new int [][] {
				{ 10, 20, 30, 40},
				{ 50, 60, 40, 80, 90},
				{ 11, 22, 55},
				{ 33, 22}
		};
		
		
		
		
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.printf("%5d", a[i][j]);
			}
			System.out.println();
		}
	
	}

}
