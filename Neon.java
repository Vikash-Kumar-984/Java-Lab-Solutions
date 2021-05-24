//A neon number is a number where the 
//sum of digits of square of the number is equal to the number.

import java.util.Scanner;
public class Neon {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number");
		int a=sc.nextInt();
		int sq=a*a;
		int d=a*a;

		int sum=0;
	while(sq>0)
	{
		int digit=sq%10;
		sum+=digit;
		sq=sq/10;
	}
	System.out.println("The square of the number is : "+d);
	if (a==sum)
		System.out.println(a+ " is the neon number");
	else
		System.out.println(a+ " is the not a neon number");
		
	}
}

