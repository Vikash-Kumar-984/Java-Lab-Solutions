//User Defined Exception

class MyException extends Exception
{
  private int a;
  MyException (int i)
  {
	  a=i;
  }
  public String toString()
  {
	  return "MyException["+a+"]";
  }
}
public class UserDefinedException {
   static void compute(int b) throws MyException{
   if(b<1000) throw new MyException(b);
   System.out.println("Normal Exit");
   }
  
	public static void main(String[] args) {
      try {
    	  compute(2000);
    	  compute(500);
      }
      catch(MyException e)
      {
    	  System.out.println("Caught" +e);
      }
	}
}
