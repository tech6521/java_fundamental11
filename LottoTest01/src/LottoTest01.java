import java.util.*;

public class LottoTest01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int[] lotto = new int[6];
		
		
		
		System.out.println("*** 로또 프로그램 ***");
		
		System.out.printf("정수 입력(1~45): ");
		int user =sc.nextInt();
		
		for(int i=0;i<lotto.length;i++) {
			lotto[i] = r.nextInt(45)+1; //난수 1~45 사이의 난수 생성
			for(int j=0; j<i; j++) {
				if(lotto[i]==lotto[j]) {
					i--;
					break;
				}
			}
			
		}
		
		//버블정렬 후
		for(int i=0; i<lotto.length-1; i++) {
			boolean checked = false;
			for(int j=0; j<lotto.length-1-i;j++) {
				if(lotto[j] > lotto[j+1]) {
					int t = lotto[j];
					lotto[j] =lotto[j+1];
					lotto[j+1] = t;
					checked = true;
				}
			}
			if(!checked) break;
		}
		
		for(int i=0; i<lotto.length; i++) {
			if(user == lotto[i]) {
				System.out.println("오늘 운수는 대박입니다.");
			}
		}
		//System.out.printf("[ ");
		for (int i=0; i<lotto.length; i++) {
			//System.out.printf(lotto[i] + " ");
			
			for ( i=0; i<lotto.length-1;i++) {
				for(int j=i+1; j<lotto.length;j++) {
					if(lotto[i] > lotto[j]) {
						int t = lotto[i];
						lotto[i] = lotto[j];
						lotto[j] = t;
					}
				}
			}
			
			System.out.print("당첨번호: ");
			System.out.println(Arrays.toString(lotto));
		}
		sc.close();
	}

}
