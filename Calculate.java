// Java Class “Shape” with constructor to initialize the one parameter dimension

class Shape
{
	double dimension;
	Shape(double dimension)
	{
		this.dimension=dimension;
	}
}
class Circle extends Shape{
	double area,circum;
	Circle(double d)
	{
		super (d);
	}
	void area1()
	{
		area=3.14*dimension*dimension;
		System.out.println("Area of the Circle "+area);
	}
	void circum1()
	{
		circum=2*3.14*dimension;
		System.out.println("Circumference of the circle "+circum+ "\n");
	}
}
class Square extends Shape{
	double area ; double length_of_dia;
	Square(double d)
	{
		super (d);
	}
	void area1()
	{
		area=dimension*dimension;
		System.out.println("Area of the rectangle "+area);
	}
	void length()
	{
		length_of_dia=dimension * Math.sqrt(2);
		System.out.println("Length of sauare "+length_of_dia+ "\n");
	}
}
	class Sphere extends Shape
	{
		double vol,surface;
		Sphere(double d)
		{
			super(d);
		}
		void volume()
		{
			vol=4/3 * 3.14 *dimension *dimension*dimension;
			System.out.println("Volume of sphere "+vol);
		}
		void surfacearea()
		{
			surface=4*3.14*dimension*dimension;
			System.out.println("Volume of sphere "+surface);
		}
	}

public class Calculate {

	public static void main(String[] args) {
        //Shape ob1=new Shape(3);
        Circle ob2=new Circle(3);
        ob2.area1();
        ob2.circum1();
        Square ob3=new Square(5);
        ob3.area1();
        ob3.length();
        Sphere ob4=new Sphere(8);
        ob4.volume();
        ob4.surfacearea();
        
	}
}
