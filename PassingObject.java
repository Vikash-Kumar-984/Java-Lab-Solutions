// passing objects as parameters

class Data{
	int data1;
	int data2;
}
class SetData{
	void setData(Data d,int d1,int d2)
	{
		d.data1=d1;
		d.data2=d2;
	}
	void getData(Data d)
	{
		System.out.println("data1 :" +d.data1);
		System.out.println("data2 :" +d.data2);
	}
}
public class PassingObject {
	public static void main(String args[])
	{
		Data ob1=new Data();
		SetData ob2=new SetData();
		ob2.setData(ob1,36,85);
		ob2.getData(ob1);
	}

}
