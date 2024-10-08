package understandopps;

public class Circle extends Shape {

	
    double radius;
    
	public Circle(String name, double radius) {
		super(name);
		radius = this.radius;
		
	}

	@Override
	double area() {
		System.out.println("areaa got");
		return radius;
	}

	@Override
	public String toString() {
		System.out.println("String gott");
		return name;
	}

	

}
