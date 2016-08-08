
public class Cylinder extends Circle {

	public Cylinder(double radius, String color, double height) {
		super(radius, color);
		setHeight(height);
	}

	private double height;

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getVolume() {
		double volume = area * height;
		return volume;
	}

	@Override
	public void printCircle() {
		System.out.println(
				"\nCYLINDER DIMENSIONS:\nRadius: " + getRadius() + "\nColor: " + getColor() + "\nArea: " + getArea() + "\nVolume: " + getVolume());
	}
}
