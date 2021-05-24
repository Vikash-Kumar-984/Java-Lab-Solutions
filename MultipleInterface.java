interface T1
{
  void show1();	
}
class Test
{
   void show2()
   {
	   System.out.println("Show of I2 implemented");
   }
}

public class MultipleInterface extends Test implements T1 {
	public void show1()
	{
		System.out.println("Show of T1 implemented");
	}

	public static void main(String[] args) {
         MultipleInterface ob=new MultipleInterface();
         ob.show1();
         ob.show2();
	}
}
