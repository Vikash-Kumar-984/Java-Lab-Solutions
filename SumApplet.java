import java.awt.*;
import java.awt.event.*;

class SumApplet extends Frame {
     TextField tf1,tf2,tf3;
     Button b;
     SumApplet()
     {
    	 super("I will add the numbers");
    	 setBounds(10,10,500,500);
    	 setVisible(true);
    	 setLayout(null);
    	 
    	 tf1=new TextField(20);
    	 tf1.setBounds(20,20,20,100);
    	 add(tf1);
    	 tf2.setBounds(220,20,100,20);
    	 add(tf2);
    	 b=new Button("ADD");
    	 b.setBounds(20,140,60,60);
    	 add(b);
    	 tf3=new TextField(20);
    	 tf3.setBounds(220,140,100,20);
    	 add(tf3);
    	 
     }
     public void actionPerformed(ActionEvent ae)
     {
    	 String str1=tf1.getText();
    	 String str2=tf2.getText();
    	 int a=Integer.parseInt(str1);
    	 int b=Integer.parseInt(str2);
    	 int c=a+b;
    	 tf3.setText(String.valueOf(c));
     }
	public static void main(String[] args) {
         new SumApplet();
	}

}
