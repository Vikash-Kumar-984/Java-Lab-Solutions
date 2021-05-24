import java.util.Scanner;
public class ExceptionHandling {

	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the values of a and b");
       int a=sc.nextInt();
       int b=sc.nextInt();
       try {
    	   int c=a/b;
    	   System.out.println("Valid Operation :)");
       }
       catch(Exception e)
       {
    	   System.out.println(e);
    	   System.out.println("Invalid Operation :(");
    	   System.out.println("Please try again ");
       }
       System.out.println("See you soon :)");
	}

}
