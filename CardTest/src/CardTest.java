class Card {
	//�ν��Ͻ� ����, ���� �ʵ�
	String Kind;
	int number;
	
	//Ŭ���� ����, ������ �ʵ�
	static int width = 100;
	static int height = 250;
	
	// �⺻ ������(����Ʈ������)
	Card() {
		
	}
	
	
	//������ �����ε�
	Card(String k, int n) {
		Kind = k;
		number = n;
	}
	
	
}


public class CardTest {
	public static void main(String[] args) {

		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height);
		
		Card c1 = new Card();
		c1.Kind = "Heart";
		c1.number = 7;
		
		
		Card c2 = new Card();
		c2.Kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1�� " + c1.Kind + ", " + c1.number + "�̸�, "
				+ "ũ��� (" + c1.width + ", " + c1.height + ")");
		System.out.println("c2�� " + c2.Kind + ", " + c2.number + "�̸�, "
				+ "ũ��� (" + c2.width + ", " + c2.height + ")");
		
		System.out.println("c1�� width�� height�� ���� 50, 80���� �����մϴ�.");
		
		c1.width = 50;
		c1.height = 80;
		
		System.out.println("c1�� " + c1.Kind + ", " + c1.number + "�̸�, "
				+ "ũ��� (" + c1.width + ", " + c1.height + ")");
		System.out.println("c2�� " + c2.Kind + ", " + c2.number + "�̸�, "
				+ "ũ��� (" + c2.width + ", " + c2.height + ")");
		
		Card c3 = new Card("Diamond", 13);
		
		System.out.println("c3�� " + c3.Kind + ", " + c3.number + "�̸�, "
				+ "ũ��� (" + c3.width + ", " + c3.height + ")");
		System.out.println("c3�� " + c3.Kind + ", " + c3.number + "�̸�, "
				+ "ũ��� (" + c3.width + ", " + c3.height + ")");
		
	}
	

}
