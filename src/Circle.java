
public class Circle extends TwoDimensionalShape{

	private double radius;
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public void GetInfo() {
	 
		System.out.println("Bu şekil iki boyutludur ve daire'dir. ");
	
		System.out.println("Bu dairenin alanı "+ calculateArea());
		
	}

	@Override
	public double calculateArea() {
		
		return Math.PI*(Math.pow(radius, 2));
		
	}

	public Circle(double radius) {
		
		this.radius = radius;
	}

}
