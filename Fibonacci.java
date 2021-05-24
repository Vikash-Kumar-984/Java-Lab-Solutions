// Fibonacci series
public class Fibonacci {

	public static void main(String[] args) {
		int first=0;
		int second=1;
		System.out.println(+first);
		System.out.println(+second);
		for(int i=0;i<8;i++)
		{
			int c=first + second;
			System.out.println(+c);
			first=second;
			second=c;
			
		}

	}

}
