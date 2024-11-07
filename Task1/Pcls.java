package Task1;

public class Pcls {
	String Student(int id,String name) {
		return id+name;
		
	}
	

	public static void main(String[] args) {
		Pcls P=new Pcls();
		System.out.println(P.Student(123, " " +"Pooja"));
		System.out.println(P.Student(145,"  " + "tejju"));
	}

}
