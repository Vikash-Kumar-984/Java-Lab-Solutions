import java.util.Scanner;

public class Biggest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter 3 different numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int big = 0;
		if(a>b)
		{
			if(a>c)
			{
				System.out.print("The biggest number is : "+a);
				big=a;
			}
			else
			{
				System.out.println("The biggest number is: "+c);
				big=c;
			}
		}
		if(b>a) {
			if(b>c) {
				System.out.println("The biggest number is: "+b);
				big=b;
			}
			else {
				System.out.println("The biggest number is: "+c);
				big=c;
			}
		}
		if(big>0)
		System.out.println("\n The big number is positive");
		if(big<0)
			System.out.println("\n The big number is negative");

	}

}
