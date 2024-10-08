package abstraction;

public class Fd  implements Account{

	@Override
	public void deposit() {
		System.out.println("money is deposited in fd");
		
	}

	@Override
	public void withdraw() {
		System.out.println("money is withdrawan  in fd");
		
	}
	

}
