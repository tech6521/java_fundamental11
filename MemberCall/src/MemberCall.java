
	
public class MemberCall {
	int iv = 10;
	static int cv = 20;

	
	int iv2 = cv;
	//static int cv2 = iv //����, Ŭ���� ������ �ν��Ͻ� ������ ����� �� ����.
	static int cv2 = new MemberCall().iv; // ��ó�� ��ü�� �����ؾ� ��밡�� �͸� �ν��Ͻ�(��ȸ�� �ν��Ͻ�)
			
		static void staticMethod1() {
		System.out.println(cv);
	//	System.out.println(iv); 
		MemberCall c = new MemberCall();
		System.out.println(c.iv);
	}
	
	 void instanceMethod1() {
		 System.out.println(cv);
		 System.out.println(iv);
	 }
	 
	
	 
	 static void staticMethod2() {
		 staticMethod1();
		// instanceMethod1();
		 MemberCall c = new MemberCall();
		 c.instanceMethod1();
	 }
	 
	 void instanceMethod2() {
		 staticMethod1();
		 instanceMethod1();
	 }
	 
	 public static void main(String[] args) {
		MemberCall c = new MemberCall();
		staticMethod1();
		int a = c.iv;
		
		System.out.println(a);
	 }
	
}
