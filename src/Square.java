
public class Square  extends TwoDimensionalShape{

	
	private double a;
	

	public Square(double a) {
;
		this.a = a;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	@Override
	public void GetInfo() {
		
		System.out.println("Bu şekil bir kare'dir ve iki boyutludur");	
		System.out.println("Bu karenin alanı "+ calculateArea());
	}

	@Override
	public double calculateArea() {
		return Math.pow(getA(), 2);
	}

}
