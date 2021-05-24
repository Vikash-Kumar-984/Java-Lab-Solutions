// Search the number in an array

import java.util.Scanner;
public class Search {
   
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of input");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter the key to be searched");
		int key=sc.nextInt();
		int flag=0;
		for(int a:arr)
		{
			if (a==key)
				{
				flag=1;
			    break;
			    }
		}
		if(flag==1)
			System.out.println(key + " is found :)");
		else
			System.out.println(key+ " is not found :(");
		

	}
}
