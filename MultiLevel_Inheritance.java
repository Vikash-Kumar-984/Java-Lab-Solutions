import java.util.Scanner;
class A
{
    int m,n;
    void getData()
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the value of m and n");
    	m=sc.nextInt();
    	n=sc.nextInt();
    }
    void putData()
    {
    	System.out.println("M= "+m+ " N= "+n);
    }
}
class B extends A{
	int sum;
	void add()
	{
		sum=m+n;
		System.out.println("Sum= "+sum);
	}
}
public class MultiLevel_Inheritance {

	public static void main(String[] args) {
         B ob=new B();
         ob.getData();
         ob.putData();
         ob.add();
	}

}
