class Thread1 extends Thread
{
  public void run()
  {
	  for(int i=1;i<5;i++)
		  System.out.println("From Thread A: "+i);
  }
}
class Thread2 extends Thread
{
  public void run()
  {
	  for (int i=6;i<=10;i++)
		  System.out.println("From Thread B: "+i);
  }
}
public class ThreadClass
{
   public static void main (String args[])
   {
	   Thread1 t1=new Thread1();
	   Thread2 t2=new Thread2();
	   t1.start();
	   t2.start();
	   
   }
}