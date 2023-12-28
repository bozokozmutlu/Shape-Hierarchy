
public class Cube extends ThreeDimensioalShape{
    private double a,b,c;
    
	public Cube(double a, double b, double c) {

		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	@Override
	public void GetInfo() {
	System.out.println("Bu şekil 3 boyutludur ve küp'dür. ");
		
		System.out.println("Bu küpün alanı "+ calculateArea());	
		System.out.println("Bu küpün hacmi  "+ calculateVolume());	
	}

	@Override
	public double calculateVolume() {
		return a*b*c;
	}

	@Override
	public double calculateArea() {
		return 2*((a*c)+(a*b)+(b*c));
	}

}
