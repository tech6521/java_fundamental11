class DocumentTest {
	static int count = 0;
	String name;
	
	DocumentTest() {
		this("�������" + ++count);
	}
	
	DocumentTest(String name) {
		this.name = name;
		System.out.println("���� " + this.name + "�� �����Ǿ����ϴ�.");
	}
}

public class Document {
	public static void main(String[] args) {
		
		DocumentTest d1 = new DocumentTest();
		DocumentTest d2 = new DocumentTest("�ڹ�.txt");
		DocumentTest d3 = new DocumentTest();
		DocumentTest d4 = new DocumentTest();
	}

}
