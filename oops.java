package nov07;
interface n1{
	int a=10;
	void print();
}
interface n2{
	int b=20;
	void display();
}
public class oops implements n1,n2 {
	

	public static void main(String[] args) {
		oops o=new oops();
		o.print();
		o.display();
		System.out.println("inteface values are:"+o.a+" "+o.b);
		
	}
	

	
	public void display() {
		System.out.println("display interface");
	}

	public void print() {
		System.out.println("print interface");
		
		
	}

}
