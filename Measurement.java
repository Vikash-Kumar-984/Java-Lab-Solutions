import java.util.Scanner;
interface perimeter{
	void compPerimeter();
}
class Ball implements perimeter
{
    public void compPerimeter()
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the radius ");
    	float r=sc.nextFloat();
    	double circlePerimeter=2*3.14*r;
    	System.out.println("Perimeter of ball "+circlePerimeter);
    }
}
class Rectangle implements perimeter{
	public void compPerimeter()
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the length and breadth ");
		float l=sc.nextFloat();
		float b=sc.nextFloat();
		double rectPerimeter=2*(l+b);
		System.out.println("Perimeter " +rectPerimeter);
	}
}

public class Measurement {

	public static void main(String[] args) {
		Ball ob1=new Ball();
		ob1.compPerimeter();
		Rectangle ob2=new Rectangle();
		ob2.compPerimeter();

	}

}
