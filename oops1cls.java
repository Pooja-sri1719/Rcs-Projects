package nov07;
interface add{
	
	void adding();
}
interface sub{
	void sub();
}
interface multi{
	void mul();
}

public class oops1cls implements add,sub,multi {
	

	public static void main(String[] args) {
		oops1cls o=new oops1cls();
		o.adding();
		o.sub();
		o.mul();
		
	}

	
	public void mul() {
		int a=10;
		int b=20;
		int c=a*b;
		System.out.println("multiplication of numbers"+" "+c);
		
	}

	
	public void sub() {
		int a=10;
		int b=20;
		int c=a-b;
		System.out.println("substraction of numbers"+" "+c);
		
		
	}

	
	public void adding() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("addition of numbers"+" "+c);
		
		
	}

}
