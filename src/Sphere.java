

public class Sphere extends ThreeDimensioalShape{
	private double radius;
	public Sphere(double radius) {
 
            setRadius(radius);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public void GetInfo() {
	System.out.println("Bu şekil 3 boyutludur ve küre'dir. ");
		
		System.out.println("Bu kürenin alanı "+ calculateArea());	
		System.out.println("Bu kürenin hacmi  "+ calculateVolume());		
	}

	@Override
	public double calculateVolume() {
		

		return (4/3)*Math.PI*Math.pow(radius,3);
	}

	@Override
	public double calculateArea() {
		
		return 4*Math.PI*Math.pow(radius, 2);
	}

}
