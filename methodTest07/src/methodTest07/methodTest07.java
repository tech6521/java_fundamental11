package methodTest07;

public class methodTest07 {
	
	static int x = 700; // ���� ����(global Variable);
	static int y = 900;
	
	public static void printX() {
		System.out.println("3�� x = " + x);
	}
	
	public static void main(String[] args) {
		System.out.println("1�� x = " + x);
		
		int x =800; //�������� (local Variable);
		
		System.out.println("2�� x = " + x);
		
		printX();
		
		System.out.println("4�� x = " + methodTest07.x);
		
		System.out.println("5�� y = " + y);
	}

}
