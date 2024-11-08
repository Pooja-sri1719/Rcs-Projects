package nov07;
interface parentcar{
	void changegear(int value);
	void speedup(int increment);
	void applybreakes(int decrement);
	void displayAll();
}

public  class opps3 implements parentcar{
	int speed=0;
	int gear=1;
	String modelname="suzuki";
	String engineType="z9";
	
	public static void main(String[] args) {
		
		
	}
	
	public void speedup(int increment) {
		speed +=increment;
		
	}

	
	public void applybreakes(int decrement) {
		speed -=decrement;
			
	}
	public void changegear(int value) {
		gear=value;
	}

	
	public void displayAll() {
		
		System.out.println("model:"+ modelname+" "
				+ ""+"engine:"+ engineType+" "+"speed:"+ speed+" "+"Gear:"+gear);
		
	}
	
	

	}

