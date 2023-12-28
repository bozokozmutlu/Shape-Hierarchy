
public class ShapeTest {
public static void main(String[] args) {
	Shape[] sekiller= new Shape[6];
	sekiller[0]=new Square(2);
	sekiller[1]=new Circle(4);
	sekiller[2]=new Triangle(5,2);
	sekiller[3]=new Sphere(8);
	sekiller[4]=new Cube(2,2,2);
	sekiller[5]=new TetraHedron(3);
	
	for(Shape s: sekiller) {
	      s.GetInfo();
		}
	}
}

