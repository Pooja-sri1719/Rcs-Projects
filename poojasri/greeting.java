package poojasri;

public class greeting {

		long mn;
		String name;
	

	public static void main(String[] args) {
		greeting g1=new greeting();
		greeting g2=new greeting();
		
		
		g2.mn=9908857637L;
		g2.name=" Pooja sri";
		greeting g3=new greeting();
		g3.mn=9908857639L;
		g3.name="Sandhya";
		System.out.println(g2.name+" " +g1.name);
		System.out.println(g2.mn+" "+g2.name);
		System.out.println(g3.mn+" "+g3.name);
		
		
		

	}

}
