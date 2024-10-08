
public class Attachment {
	
	String name;
	double size;
	String type;
	/**
	 * @param name
	 * @param size
	 * @param type
	 */
	public Attachment(String name, double size, String type) {
		super();
		this.name = name;
		this.size = size;
		this.type = type;
	}
	public void showDetails()
	{
	System.out.println(" Attachment name = "+name);
	System.out.println("File size = "+size +"kb");
	System.out.println("File type = "+type);
	}
}
