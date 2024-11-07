package Task1;

public class Mcls {
	String studentname(String firstname,String lastname) {
		return firstname+lastname;
	}

	public static void main(String[] args) {
		Mcls m=new Mcls();
		System.out.println(m.studentname("Pooja"," "+"Y"));
		System.out.println(m.studentname("Tejju"," "+"CH"));
			
		
		
	}

}
