package Chapter9;

import java.awt.*;
import javax.swing.*;

public class Ex7 extends JFrame
{
	public Ex7()
	{
		setTitle("계산기 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(4,4,5,5);
		
		Container c = getContentPane();
		
		c.setLayout(new BorderLayout());
		
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		c.add(jp1,BorderLayout.NORTH);
		c.add(jp2,BorderLayout.CENTER);
		c.add(jp3,BorderLayout.SOUTH);
//-----------------------------------------------
		jp1.add(new JLabel("수식입력"));
		jp1.add(new JTextField("",20));
		jp1.setBackground(Color.gray);
		jp1.setOpaque(true);
//-----------------------------------------------	
		jp2.setLayout(grid);
		String[] ja = {"CE","계산","+","-","*","/"};
		for(int i = 0; i<10; i++)
		{
			JButton b = new JButton(Integer.toString(i));
			jp2.add(b);
		}
		for(int i = 0; i<ja.length; i++)
		{
			JButton b = new JButton(ja[i]);
			if(i >= 2 && i <= 5)
			{
				b.setBackground(Color.cyan);
				b.setOpaque(true);
			}
			jp2.add(b);
		}
//-----------------------------------------------
		jp3.add(new JLabel("계산결과"));
		jp3.add(new JTextField("",20));
		jp3.setBackground(Color.yellow);
		jp3.setOpaque(true);
//-----------------------------------------------
		setSize(600,300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex7();
	}

}
