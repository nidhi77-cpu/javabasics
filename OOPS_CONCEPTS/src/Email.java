
public class Email {
	String sender;
	String subject;
	String msg;
	Attachment a1=new Attachment("file1", 2.5, "txt" );
	public Email(String sender, String subject, String msg)
	{
	this.sender=sender;
	this.subject=subject;
	this.msg=msg;
	}
	public void openMail()
	{
	System.out.println(" sender name = "+sender);
	System.out.println("subject = "+subject);
	System.out.println("msg = "+msg);
	} }
