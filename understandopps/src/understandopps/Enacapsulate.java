package understandopps;

public class Enacapsulate

{
   private  String geekname;
   private int geekage;
   private int geekroll;
   
   
   
   public int getage() {
	   return geekage;
   }
   
   public int getroll()
   {
	   return geekroll;
   }
   
   public String getname()
   {
	   return geekname;
   }
   public String setname(String value)
   {
	   return geekname = value;
   }

   public int setage(int aging)
   {
	   return geekage = aging;
   }

   public int setroll(int value)
   {
	   return geekroll = value;
   }
   
}
