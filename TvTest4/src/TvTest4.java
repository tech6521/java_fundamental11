
class Tv {
	String color;
	boolean power;
	int channel;
	
	void power() {
		power = !power;
	}
	
	void channelUp() {
		++channel;
	}
	
	void channerDown() {
		--channel;
	}
}

public class TvTest4 {
	public static void main(String[] args) {
		Tv[] tvArr = new Tv[100];
		
		for(int i=0; i<tvArr.length; i++) {
			tvArr[i] = new Tv();
			tvArr[i].channel = i+ 10;
		}
		
		for(int i=0; i<tvArr.length; i++) {
			tvArr[i].channelUp();
			//System.out.printf("tvArr[%d].channel = %d%n", i, tvArr[i].channel);
			System.out.println("tvArr[" + i + "].channel = " + tvArr[i].channel);
		}
	}
}


