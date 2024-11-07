package nov06;
 import java.util.Scanner;
public class switchcls {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a names(1-7) for the day of the week");
		int days=s.nextInt();
		switch (days) {
		case 1:
			System.out.println("sunday");
			break;
		case 2:
			System.out.println("monday");
			break;
		case 3:
			System.out.println("tuesdat");
			break;
		case 4:
			System.out.println("wednesdsy");
			break;
		case 5:
			System.out.println("thursday");
			break;
		case 6:
			System.out.println("friday");
			break;
		case 7:
			System.out.println("saturday");
			break;
			
			
		}
		s.close();
			
		}
	}


