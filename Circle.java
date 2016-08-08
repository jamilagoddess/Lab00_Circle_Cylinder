
public class Circle {
	
	public Circle(double radius, String color) {
		super();
		setRadius(radius);
		setColor(color);
	}

	private double radius = 1;
	private String color = "red";
	public double area = 0;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	//create method to calculate area
	public double getArea() {
		area = Math.PI * (radius * radius);
		return area;
	}
	
	//create method to print values
	public void printCircle() {
		//double area;
		System.out.println("\nCIRCLE DIMENSIONS:\nRadius: " + radius + "\nColor: " + color + "\nArea: " + getArea());
	}
}
