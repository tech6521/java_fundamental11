package continue02;

public class Continue02 {
	public static void main(String[] args) {
		
		int sum =0;
		for(int i=1; i<=10 ; i++) {
			if(i%3 ==0) {
				continue;
			}
			
			
			System.out.println(i);
		}
		
	}
}
