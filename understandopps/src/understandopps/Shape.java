package understandopps;

abstract class Shape {
	String name = "Nidhi";
	abstract double area();
    public abstract  String toString();
    
    // abstract class constructor
    public Shape(String name)
    {
    	this.name = name;
    }
    
    // concerte class
    public String getcolor(String name)
    {
    	return name;
    }

}
