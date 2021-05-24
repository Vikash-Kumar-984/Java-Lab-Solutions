//Average of the students

import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students ");
		int n=sc.nextInt();
		String name[]=new String[n];
		int total[]=new int[n];
		int grand=0;
		for (int i=0;i<n;i++)
		{   sc.nextLine();
			System.out.println("Enter the name of student" +(i+1)+":");
			name[i]=sc.nextLine();
			System.out.println("Enter the marks of student" +(i+1)+ ":");
			total[i]=sc.nextInt();
			grand+=total[i];
		}
		float avg=grand/(float)n;
		System.out.println("Average marks of class "+avg);
		for(int i=0;i<n;i++)
		{
			System.out.println("Deviation of marks "+name[i]+ "=" +(total[i]-avg));
		}
	}
}
