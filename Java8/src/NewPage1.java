import java.util.Comparator;

public class NewPage1 implements Comparator<String> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	/// compartotor stuff to
	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		int a1 = Integer.parseInt(o1);
		int a2 = Integer.parseInt(o2);
		
		return a2-a1;
		
	}

}