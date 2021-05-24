import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Alpha extends JApplet implements ActionListener {
    JButton b1,b2;
    JLabel l;
    public void init()
    {
    	Container cp=getContentPane();
    	setLayout(new FlowLayout());
    	b1=new JButton("ALPHA");
    	cp.add(b1);
    	b2=new JButton ("BETA");
    	cp.add(b2);
    	l=new JLabel();
    	cp.add(l);
    	b1.addActionListener(this);
    	b2.addActionListener(this);
    }
	public void actionPerformed(ActionEvent ae) {
       if(ae.getSource()==b1)
    	   l.setText("ALPHA is pressed");
       else
    	   l.setText("BETA is pressed");
	}

}

/*
<applet code="Alpha" width=500 height=500>
</applet>
*/