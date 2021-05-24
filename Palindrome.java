import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Please enter the number: ");
		int a=sc.nextInt();
		int rev=0;
		int b=a;
		while(b>0)
		{
		  int digit=b%10;
		  rev=rev*10+digit;
		  b=b/10;
		}
		
		if(a==rev)
			System.out.println("Whoooa, " +a+ " is a Palindrome number :)");
		else
			System.out.println(a+ " is not a Palindrome number :(");

	}

}
