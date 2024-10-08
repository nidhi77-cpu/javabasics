package understandopps;

public class Rectangle extends Shape {
   double length;
   double width;
	public Rectangle(String name,  double length,  double width) {
		super(name);
		length = this.length;
		width = this.width;
	}

	@Override
	double area() {
		System.out.println("areaa got agaian ");
		return length* width;
	}

	@Override
	public String toString() {
		System.out.println("Stringgggggot");
		return name;
	}

}
