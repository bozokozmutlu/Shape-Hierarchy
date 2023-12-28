
public class TetraHedron extends ThreeDimensioalShape{

	
	private double a ;
	
	public TetraHedron(double a) {

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
      System.out.println("Bu şekil 3 boyutludur ve düzgün dörtyüzlü'dür. ");
		
		System.out.println("Bu düzgün dörtyüzlünün alanı "+ calculateArea());	
		System.out.println("Bu  düzgün dörtyüzlünün hacmi  "+ calculateVolume());	 		
	}

	@Override
	public double calculateVolume() {
		return (Math.sqrt(2))/12* Math.pow(a, 3);
	}

	@Override
	public double calculateArea() {

		return Math.sqrt(3) * Math.pow(getA(), 2);	}

}
