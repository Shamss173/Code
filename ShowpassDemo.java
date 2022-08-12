import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ShowpassDemo
{	ShowpassDemo()
	{
		JFrame f = new JFrame("My Frame");
		JPasswordField pf = new JPasswordField(15);
		JRadioButton b = new JRadioButton("Show Password");
		f.add(pf); f.add(b);
		f.setLayout(new FlowLayout());
		f.setSize(300,250);
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				
				if(b.isSelected())	
				{
					pf.setEchoChar((char)0);	
				}
				else
				pf.setEchoChar('*');		
			}
		});
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}
public static void main(String arg[])
{	
		new ShowpassDemo();
}

}