package abstraction;

public class Savings implements Account {

	@Override
	public void deposit() {
		
		System.out.println("money is deposited in savings account");
	}

	@Override
	public void withdraw() {
		
		System.out.println("money is withdrawan in savings account");
	}

}
