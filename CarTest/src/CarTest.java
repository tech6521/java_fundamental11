class Car {
	int serialNo;
	
	String color;
	String gearType;
	int door;
	
	static int count = 1;
	
	//�ν��Ͻ� �ʱ���
	{
		serialNo = ++count;
	}
	
	//����Ʈ ������
	Car() {
		//this("black", "auto", 4);
		this.color = "black";
		this.gearType = "auto";
		this.door = 4;
		
		
		
	}
	
	Car(String color) {
		//this(color, "auto", 4);
		this.color = color;
		this.gearType = "auto";
		this.door = 4;
	}
	
	// �Ű����� �޴� ������
	Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = "auto";
		this.door = 4;
		
	}
	
	//���� ������
	Car(Car c) {
	//	this(c.color, c.gearType, c.door);
		
		this.color = c.color;
		this.gearType = c.gearType;
		this.door = c.door;
	}
}

public class CarTest {
	public static void main(String[] args) {
		Car c1 = new Car();
//		c1.color = "white";
//		c1.gearType = "auto";
//		c1.door=4;
		
		Car c2 = new Car("White", "auto", 4);
		
		Car c3 = new Car("blue");
		
		Car c4 = new Car(c3);
		
		System.out.println("c1�� serialNo=" + c1.serialNo + ", color=" + c1.color + ", c1.gearType=" + c1.gearType+ ", door=" + c1.door);
		System.out.println("c2�� serialNo=" + c2.serialNo + ", color=" + c2.color + ", c2.gearType=" + c2.gearType+ ", door=" + c2.door);
		System.out.println("c3�� serialNo=" + c3.serialNo + ", color=" + c3.color + ", c3.gearType=" + c3.gearType+ ", door=" + c3.door);
		System.out.println("c4�� serialNo=" + c4.serialNo + ", color=" + c4.color + ", c4.gearType=" + c4.gearType+ ", door=" + c4.door);
		
	}

}
