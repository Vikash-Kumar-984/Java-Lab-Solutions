//  different types of constructors

public class Constructor<car> {
    String carColor;
    Constructor()
    {
    	System.out.println("Default constructor ");
    }
    Constructor(String carColor)
    {
    	this.carColor=carColor;
    }
    Constructor(Constructor ob)
    {
    	carColor=ob.carColor;
    }
    void display()
    {
    	System.out.println("Color of the car is "+ carColor);
    }
	public static void main(String[] args) {
		Constructor c1=new Constructor();
		Constructor c2=new Constructor("Black");
		c2.display();
		Constructor c3=new Constructor(c2);
		c3.display();
	}
}
