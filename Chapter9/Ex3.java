package Chapter9;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex3 extends JFrame
{
	public Ex3()
	{
		setTitle("Ten Color Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(1,10);
		
		Container c = getContentPane();
		
		c.setLayout(grid);
		for(int i = 0; i < 10; i++)
		{
			JButton b = new JButton(Integer.toString(i));
			c.add(b);
		}
		
		setSize(600, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex3();

	}

}
