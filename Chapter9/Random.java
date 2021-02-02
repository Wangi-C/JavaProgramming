package Chapter9;

import java.awt.*;
import javax.swing.*;

public class Random extends JFrame
{
	public Random()
	{
		setTitle("���� ���� �г��� ���� ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.setLayout(new BorderLayout());
		
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		
		c.add(jp1,BorderLayout.NORTH);
		c.add(jp2,BorderLayout.CENTER);
		c.add(jp3,BorderLayout.SOUTH);
		
		//jp1
		jp1.setBackground(Color.LIGHT_GRAY);
		jp1.add(new JButton("����"));
		jp1.add(new JButton("�ݱ�"));
		jp1.add(new JButton("������"));
		
		//jp2
		jp2.setBackground(Color.white);
		jp2.setLayout(null); //�� ��������ġ�� ����ڰ� ���Ƿ� �ٲܶ� ���̾ƿ� ����
		
		for(int i = 0; i < 10; i++)
		{
			JLabel jl = new JLabel("*");
			int x = (int)((Math.random()*200)+50);
			int y = (int)((Math.random()*200)+50);
			jl.setLocation(x,y);
			jl.setSize(10, 10);
			jp2.add(jl);
			
		}
		
		//jp3
		jp3.setBackground(Color.yellow);
		jp3.add(new JButton("Word Input"));
		jp3.add(new JTextField("",20));
		
		setSize(400,400);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Random();
		
	}

}
