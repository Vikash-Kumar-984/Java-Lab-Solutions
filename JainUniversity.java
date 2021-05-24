class Thread3 extends Thread
{
  public void run()
  {
	  while(true)
	  {
		  try {
			  System.out.println("Department of CSE ");
			  Thread.sleep(2000);
		  }catch(Exception e) {}
	  }
  }
}
  class Thread4 extends Thread
  {
	  public void run()
	  {
		  while(true)
		  {
			  try {
				  System.out.println("Jain University ");
				  Thread.sleep(5000);
			  }catch(Exception e) {}
		  }
	  }
  }



public class JainUniversity {

	public static void main(String[] args) {
        Thread3 t1=new Thread3();
        Thread4 t2=new Thread4();
        t1.start();
        t2.start();
	}

}
