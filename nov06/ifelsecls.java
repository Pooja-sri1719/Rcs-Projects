package nov06;

public class ifelsecls {

	public static void main(String[] args) {
		double balance=1500;
		System.out.println("amount to withdraw");
		double amount=6000;
		if(amount<=0 || amount>balance) {
			System.out.println("withdraw has failed");
		}
		else {
			balance-=amount;
			System.out.println("withdraw has succeeded");
		}
	}

}
