
public class RunnableInterface implements Runnable 
	{
		public void run()
		{
		for(int i=1;i<=10;i++)
			System.out.println("From thread "+i);
		}
	
	public static void main(String[] args) {
        RunnableInterface ob=new RunnableInterface();
        Thread t= new Thread(ob);
        t.start();
	}
   }
