
public class Triangle extends TwoDimensionalShape{

	
	private double a,h;

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}

	public Triangle(double a, double h) {

            setA(a);
            setH(h);
	}

	@Override
	public void GetInfo() {
		// TODO Auto-generated method stub
		System.out.println("Bu şekil iki boyutludur ve üçgen'dir. ");
	
		
		System.out.println("Bu üçgenin alanı "+ calculateArea());
		
	}

	@Override
	public double calculateArea() {
		return  (getA()*getH())/2;
	}
	
}
