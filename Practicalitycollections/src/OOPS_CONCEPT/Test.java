package OOPS_CONCEPT;

public class Test extends Abstraction implements Animal {

	@Override
	void test() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void superdaa() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void walk() {
		System.out.println("hurray interface has implemented that is abstraction guyssss");
		
	}
	
	
	public  static void main(String [] args) {
		Test t = new Test();
		t.walk();
		
	}

}
