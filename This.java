public class This {
	int a=10;
	static int b=20;
	void ABC()
	{
		this.a=100;
		System.out.println(a);
		this.b=500;
		System.out.println(b);
	}



	public static void main(String[] args) {
      new This().ABC();
	}
}
