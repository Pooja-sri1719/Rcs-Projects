package Task1;

public class REcls {
	static String Studentrank(int id,String name, int rank) {
		return id + " " + name + " " + rank;
		
	}

	public static void main(String[] args) {
	
		REcls s=new REcls();
			System.out.println(s.Studentrank(3, " "+  "pooja", 2));
			System.out.println(s.Studentrank(3, " "+  "pooja", 2));
	}

}
