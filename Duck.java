//( A duck number contains zeros, but there should not be zero present in the 
//beginning of the number.

import java.util.Scanner;
public class Duck {
	
	public static void main(String[] args) {
		System.out.println("Please enter the number ");
		Scanner sc=new Scanner(System.in);
		String n=sc.nextLine();
		int a=0;
		int l=n.length();
		for(int i=0;i<l;i++)
		{
			char ch=n.charAt(i);
			if(ch=='0')
				a++;
		}
		char first=n.charAt(0);
		if(a>0 && first!=0)
			System.out.println(n+ " is a duck number :|" + " and contains " +a+ " zeroes");
		else
			System.out.println(n+ "is not a duck number");
		
	}
}
