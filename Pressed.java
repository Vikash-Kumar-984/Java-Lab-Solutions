import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Pressed extends Applet implements ActionListener {
	public void init() {
		button1 = new Button("Button 1");
		add(button1);
		button1.addActionListener(this);

		
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button1) 
			System.out.println("Button 1 was pressed");
		
	}

	Button button1;
}