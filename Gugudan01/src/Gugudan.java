
public class Gugudan {
	public static void main(String[] args) {
		//1�� for�� Ȱ��
		/*for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i + "*" + j + "=" + (i*j));
			}
			System.out.println();
		}*/
		
		// 2�� -while�� Ȱ��
		
		/*int i=2;
		while(i<=9) {
			int j=1;
			while(j<=9) {
				System.out.println(i + "*" + j + "=" + (i*j));
				j++;
				
			}
			
			System.out.println();
			i++;
		}*/
		//do ~while��
		int i=2; 
		do {
			int j=1;
			do {
				System.out.println(i + "*" + j + "=" + (i*j));
				j++;
			}while(j<=9);
		i++;
		System.out.println();
		
		}while(i<=9);
	}

}
