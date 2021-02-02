package Chapter9;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex5 extends JFrame
{
	public Ex5() 
	{
		setTitle("4x4 Color Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(4,4);
		
		Container c = getContentPane();
		
		c.setLayout(grid);
		
//		JLabel rl = new JLabel("1");
//		JLabel ls = new JLabel("1");
//		
//		rl.setBackground(Color.red);
		
		for(int i = 0; i < 16; i++)
		{
			JLabel l = new JLabel(Integer.toString(i));
			if(i == 0) {
				l.setBackground(Color.RED);
			}
			else if(i == 1) {
				l.setBackground(Color.orange);
			}
			else if(i == 2) {
				l.setBackground(Color.yellow);
			}
			else if(i == 3) {
				l.setBackground(Color.green);
			}
			else if(i == 4) {
				l.setBackground(Color.cyan);
			}
			else if(i == 5) {
				l.setBackground(Color.blue);
			}
			else if(i == 6) {
				l.setBackground(Color.magenta);
			}
			else if(i == 7) {
				l.setBackground(Color.gray);
			}
			else if(i == 8) {
				l.setBackground(Color.pink);
			}
			else if(i == 9) {
				l.setBackground(Color.lightGray);
			}
			else if(i == 10) {
				l.setBackground(Color.white);
			}
			else if(i == 11) {
				l.setBackground(Color.black);
			}
			else if(i == 12) {
				l.setBackground(Color.black);
			}
			else if(i == 13) {
				l.setBackground(Color.orange);
			}
			else if(i == 14) {
				l.setBackground(Color.blue);
			}
			else if(i == 15) {
				l.setBackground(Color.magenta);
			}
			l.setOpaque(true);
			c.add(l);
		}
		
		setSize(600,300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex5();
	}

}
