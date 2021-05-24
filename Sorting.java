//Sorting of the array

import java.util.Scanner;
public class Sorting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of elements \n");
		int n=sc.nextInt();
		int  arr[] =new int[n];
		int temp;
		
		System.out.println("Enter the elements \n");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
		for(int a=i;a>0;a--)
		{
			if(arr[a]<arr[a-1]) {
				temp=arr[a];
				arr[a]=arr[a-1];
				arr[a-1]=temp;
			}
		}
		}System.out.println("Yeah!!! The array is sorted ");
		for(int i=0;i<n;i++) {
			
			System.out.println(arr[i]);
		}
		
	}

}
